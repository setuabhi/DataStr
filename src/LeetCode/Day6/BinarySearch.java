package LeetCode.Day6;

/**
 * left<=right so that we don't miss the last element during binary search.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a ={2,4,6,9,10,14};
        System.out.println("Index of 10= "+findusingBinarySearch(a,10));
    }

    private static int findusingBinarySearch(int[] a, int target) {
        int left=0,right=a.length-1;
        while(left<=right)
        {
          int mid=(left+right)/2;
          if(a[mid]==target)
          {
              return mid;
          }
          else if(a[mid]>target)
          {
              right=mid-1;
          }
          else
          {
              left=mid+1;
          }
        }
        return -1;
    }
}
