package 排序;

import java.util.Arrays;

/**
 * 归并排序 先分后治
 * https://www.cnblogs.com/chengxiao/p/6194356.html
 */

public class MergeSort {

    private static void merge(int arr[], int left, int mid, int right, int[] temp) {
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                // i指向的值复制给辅助数组k的指向，并且i往后移一位，k往后移一位
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {  //将左边剩下的数据填充进temp
            temp[k++] = arr[i++];
        }

        while (j <= right) { //将右边剩下的数据填充进temp
            temp[k++] = arr[j++];
        }

        k = 0;
        while (left <= right) {
            arr[left++] = temp[k++];
        }
    }

    private static void sort(int arr[], int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            //分解过程
            sort(arr, left, mid, temp);
            sort(arr, mid + 1, right, temp);
            //合并过程
            merge(arr, left, mid, right, temp);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 8, 3};
        int[] temp = new int[array.length];
        sort(array, 0, array.length - 1, temp);
        System.out.println(Arrays.toString(array));
    }
}
