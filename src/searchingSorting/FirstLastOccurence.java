package searchingSorting;

import java.util.ArrayList;
import java.util.List;

public class FirstLastOccurence {

    public static void main(String[] args) {
        int a[]={-2,-3,0,1,4,4,4,8,9,10,11};
        List<Integer> output= FindFirstLast(a,0);
        System.out.println("Fist Occurence= "+ output.get(0)+" Last Occ= "+ output.get(1));
    }
    static  List<Integer> FindFirstLast(int arr[], int target)
    {
        List<Integer> output=new ArrayList<>();
        int start=0,end=arr.length,firstOcc=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                firstOcc=mid;
                end--;
            } else if (arr[mid]<target) {
                start++;
            }
            else
            {
                end--;
            }
        }
        output.add(firstOcc);
        int lastOcc=-1;
        start=0;
        end=arr.length;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                lastOcc=mid;
                start++;
            } else if (arr[mid]<target) {
                start++;
            }
            else
            {
                end--;
            }
        }
        output.add(lastOcc);
        return output;
    }

    public char nextGreatestLetter(char[] letters, char target) {
        target=letters[0];
        int start=0,end=letters.length;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(letters[mid]==target)
            {
                target= letters[mid+1];
            }
           else if((int)letters[mid]>(int)target)
            {
                end=mid-1;
            }
           else
            {
                start=mid+1;
            }
        }
        return target;
    }
}
