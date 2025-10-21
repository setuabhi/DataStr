package LeetCode.Day7;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr2D = {
                {2, 6, 4},
                {5, 8, 0},
                {1, 10, 3}
        };
        transpose(arr2D);
        for (int[] array : arr2D) {
            System.out.println(Arrays.toString(array));
        }
    }

    private static void transpose(int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D.length; j++) {
                if (i < j) {
                    arr2D[i][j] = arr2D[i][j] + arr2D[j][i] - (arr2D[j][i] = arr2D[i][j]); // Swap logic
                }
            }
        }
    }


}
