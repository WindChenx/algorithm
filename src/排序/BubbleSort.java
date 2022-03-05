package 排序;

import java.util.Arrays;

/**
 * https://baijiahao.baidu.com/s?id=1643890238963997356&wfr=spider&for=pc
 */
public class BubbleSort {
    /**
     * 每一趟找最小值，把它放在最前面
     * @param arr
     */
    static void bubbleSort(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     *每一趟找最大值，把它放在最后面
     * @param arr
     */
    static void bubbleSort2(int arr[]) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[]  array = {1,5,2,4,8,3};
        //bubbleSort(array);
        bubbleSort2(array);
        System.out.println(Arrays.toString(array));
    }
}
