package TwoDArrays;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Collections.swap;

public class TransposeMatrix {
    public static void transpose(int[][] arr)
    {
        Arrays.sort(arr, Comparator.comparingInt(a->a[0]));
        for(int i=0; i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                arr[i][j]=arr[i][j]+arr[j][i];
                arr[j][i]=arr[i][j]-arr[j][i];
                arr[i][j]=arr[i][j]-arr[j][i];
            }
        }
    }


    public static void reverseArray(int[][] arr) {
        for(int i=0; i<arr.length;i++)
        {
            for(int k=0; k<arr.length/2;k++) {
                int j = arr.length - k - 1;
                arr[i][k] = arr[i][k] + arr[i][j];
                arr[i][j]= arr[i][k] - arr[i][j];
                arr[i][k] = arr[i][k] - arr[i][j];
            }
        }
    }
}
