package ArraysAndString;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2,6,10,13};
        int[] arr2 = {1,5,6,8};
        System.out.println(Arrays.toString(mergeSorted(arr1, arr2)));
    }

    private static int[] mergeSorted(int[] arr1, int[] arr2) {
       int[] output = new int[arr1.length+arr2.length];
       int i=0,j=0,k=0;
      while(i<arr1.length || j<arr2.length)
      {
          if(i==arr1.length)
          {
              output[k++]=arr2[j];
              j++;
          }
         else if(j==arr2.length)
          {
              output[k++]=arr1[i];
              i++;
          }
         else if (arr1[i]<=arr2[j])
          {
              output[k++]=arr1[i];
              i++;
          }
          else
          {
              output[k++]=arr2[j];
              j++;
          }
      }
      return output;

    }
}
