package 排序;

import java.util.Arrays;

/**
 * https://blog.csdn.net/austral/article/details/70861032
 * 位图排序常用于海量数据的去重和排序
 * 1.找出array的最大值
 * 2.对array构建位图
 * 如数组{1,5,2,4,8,3}
 * 位图下标0,1,2,3,4,5,6,7,8
 * 对应的值0,1,1,1,1,1,0,0,1
 * 从而构建出位图数组{0,1,1,1,1,1,0,0,1}
 * 3.顺序输出位图
 */

public class BitmapSort {

    private static int[] bitmapSort(int[] arr) {
        int length = arr.length;
        int maxValue = arr[0];
        //找出arr的最大值
        for(int i = 0; i < length; i++) {
            if (maxValue < arr[i])
                maxValue = arr[i];
        }

        //构建位图数组
        byte[] bitmap = new byte[maxValue+1];
        for (int j = 0; j < length; j++) {
            bitmap[arr[j]] = 1;
        }

        //顺序输出位图
        int[] result = new int[length];
        int index = 0;
        for (int i = 0; i < bitmap.length; i++) {
            if (bitmap[i] == 1)
                result[index++] = i;
        }
        //去除多余的length
        return Arrays.copyOfRange(result,0,index);

    }

    public static void main(String[] args) {
        int[]  array = {1,5,2,4,8,3,23,35,3,7,12,8,777,256};
        System.out.println(Arrays.toString(bitmapSort(array)));
    }
}
