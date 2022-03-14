package 排序;

import java.util.Arrays;

/**
 * 快速排序
 *
 */

public class QuickSort {

    private static void quickSort(int[] arr, int low, int high) {
        if (low > high) return;
        int i = low, j = high, base = arr[low], temp;
        while (i < j) {
            //这里也要加i<j的限定条件，虽然最上面我们已经判断过i<j了，但是随着j不断减小，j是变化的，在这里向左扫描时还要再进行判断一下
            while (i< j && arr[j] > base) {
                j--;
            }

            while (i < j && arr[i] < base) {
                i++;
            }
            temp = arr[j];
            arr[j] = arr[i];
            arr[i]= temp;
        }
        //第一次排序完成了，然后分成两段再执行上面的过程
        quickSort(arr, low, i-1);
        quickSort(arr, i+1, high);


    }



    public static void main(String[] args) {
        int[] array = {30,24,5,58,18,36,12,42,39};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
