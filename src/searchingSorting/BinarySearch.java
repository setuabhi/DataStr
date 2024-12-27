package searchingSorting;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]= {1,5,6,8,33,44,100,102,104};
        System.out.println(BinarySearchEx(a,101));
    }

    private static int BinarySearchEx(int[] arr, int target) {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

}
