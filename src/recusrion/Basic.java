package recusrion;

import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        int[] a= {4,6,100,1,7,0};


        System.out.println(StringPalindrome("abhhba".toCharArray(),0,"abhhba".length()-1));

    }

    public static boolean StringPalindrome(char[] n,int start, int end) {
        if(start>=end)
        {
            return true;
        }
        if(n[start]!=n[end])
        {
            return false;
        }
        return StringPalindrome(n,start+1,end-1);

    }
    public static void reverseRecursion(int[] n,int start, int end) {
        if(start>=end)
        {
            return;
        }
        swap(n,start,end);
        reverseRecursion(n,start+1,end-1);

    }

    public static void reverse(int[] n) {
        int start=0, end= n.length-1;
        while(start<end)
        {
            swap(n,start,end);
            start++;
            end--;
        }
        System.out.println("Reverse done");
    }
    public  static void swap(int[] arr,int start, int end)
    {
        arr[start]=arr[start]+arr[end];
        arr[end]=arr[start]-arr[end];
        arr[start]=arr[start]-arr[end];
    }

    public static int sumOfN(int n) {
        if (n == 0) {
            return 0;
        }
        return n+sumOfN(n-1);

    }

    public static void printNameNTimes(int n) {
        if (n < 1) {
            return;
        }
        System.out.println("Abhinav");
        printNameNTimes(--n);

    }

    public static void print1ToN(int n) {
        if (n == 0) {
            return;
        } else {

            print1ToN(n - 1);
            System.out.println(n);
        }

    }
}
