package 剑指offer;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */


class Solution {
    //method 1  运行时间： 158 ms 占用内存：18212K
    public boolean Find(int target, int[][] array) {
        int i = array.length;
        int j = array[0].length;
        int row = i - 1;
        int col = 0;

        while (row >= 0 && col < j) {
            if (target > array[row][col]) {
                col++;
            } else if (target < array[row][col]) {
                row--;
            } else {
                return true;
            }

        }
        return false;
    }

    //method 2   运行时间： 166 ms 占用内存：17148K
    public boolean Find2(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == target)
                    return true;
            }
        }
        return false;
    }
}

