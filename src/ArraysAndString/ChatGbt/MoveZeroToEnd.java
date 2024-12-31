package ArraysAndString.ChatGbt;

import java.util.Arrays;

/**
 * input [0,0,5,9,7] output = [5,9,7,0,0]. order should remain same
 * Two Pointers example
 */
public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr ={5,0,4,0,0,2,7,0};
        moveZer0EndTwoPointer(arr);
       Arrays.stream(arr).forEach(a-> System.out.print(a+" "));
        arr = new int[]{5, 0, 4, 0, 0, 2, 7};
        moveZer0Start(arr);
        System.out.println("");
        Arrays.stream(arr).forEach(a-> System.out.print(a+" "));
    }

    private static void moveZer0EndTwoPointer(int[] array)
    {
        int start=0,end=array.length-1;
        while(end>=start)
        {
            if (array[end]==0)
            {
                end--;
            }
            else if(array[start]==0)
            {
                array[start]=array[end];
                array[end]=0;
                start++;
                end--;
            }
            else
            {
                start++;
            }
        }
    }


    private static void moveZer0Start(int[] array) {
        int i=array.length-1;
        int j=i-1;

        while (j>-1)
        {
            if(array[j]!=0 && array[i]==0)
            {
                array[i]=array[j];
                array[j]=0;
                j--;
                i--;

            }
            else if(array[i]!=0)
            {
                j--;
                i--;
            }
            else
            {
                j--;
            }
        }
    }
}
