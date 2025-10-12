package LeetCode.Day7;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr2D = {
                {2, 6, 4},
                {15, 18, 0},
                {1, 0, 3},
                {5, 10, 7}
        };
        setZero(arr2D);
        for (int[] array : arr2D) {
            System.out.println(Arrays.toString(array));
        }
    }

    private static void setZero(int[][] arr2D) {
        int[] rows = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[0].length; j++) {
                if (arr2D[i][j] == 0) {
                    rows[i] = 1;
                    break;
                }
            }
        }

        for (int i = 0; i < arr2D.length; i++) {
            if (rows[i] == 1) {
                for (int j = 0; j < arr2D[0].length; j++) {
                    arr2D[i][j] = 0;
                }
            }
        }
    }
}
