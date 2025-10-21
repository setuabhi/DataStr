package LeetCode.Day7;

import java.util.Arrays;

/**
 * output[j][arr2D.length-1-i]=arr2D[i][j];
 */
public class RotateImage {
    public static void main(String[] args) {
        int[][] arr2D = {
                {2, 6, 4},
                {5, 8, 0},
                {1, 10, 3}
        };
        int[][] output= rotateIt(arr2D);
        for (int[] array : output) {
            System.out.println(Arrays.toString(array));
        }
    }

    private static int[][] rotateIt(int[][] arr2D) {
        int[][] output =new int[arr2D.length][arr2D.length];
        for(int i = 0 ; i<arr2D.length;i++)
        {
            for (int j = 0; j< arr2D.length;j++)
            {
                output[j][arr2D.length-1-i]=arr2D[i][j];
            }
        }
        return output;
    }
}
