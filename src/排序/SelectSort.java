package 排序;

import java.util.Arrays;

/**
 * 选择排序首先在未排序序列中找到最小值，存放到起始位置
 * 它和冒泡的区别就是冒泡碰到符合条件就交换，选择是一趟走完之后再交换。交换次数比冒泡少。
 */

public class SelectSort {
    private static void selectSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int index = i;
            for (int j = i+1; j < length; j++) {
                if (arr[j] < arr[index]) {  //每次和下标为index的值比较，比它小就把更新下标index
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 8, 3};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
