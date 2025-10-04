package LeetCode.Day6;

import java.util.Arrays;

/**
 * First store in a temp array
 * Load into two arrays, line 38 important
 */

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] array1 = {4, 7, 9, 10};
        int[] array2 = {0, 5, 8};
        merge(array1, array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    private static void merge(int[] array1, int[] array2) {
        int[] tempArray = new int[array1.length + array2.length];
        int arr1Index = 0, arr2Index = 0, tempArrayIndex=0;
        while (arr1Index < array1.length && arr2Index < array2.length) {
            if(array1[arr1Index]< array2[arr2Index])
            {
                tempArray[tempArrayIndex++] = array1[arr1Index++];
            }
            else
            {
                tempArray[tempArrayIndex++] = array2[arr2Index++];
            }
        }
        while(arr1Index < array1.length) tempArray[tempArrayIndex++]=array1[arr1Index++];
        while(arr2Index < array2.length) tempArray[tempArrayIndex++]=array2[arr2Index++];
        arr1Index = 0;
        arr2Index = 0;
        for(int i: tempArray)
        {
            if(arr1Index==array1.length)
            {
                array2[arr2Index++] = i;
            }
            else {
                array1[arr1Index++] = i;
            }
        }
    }
}
