package ArraysAndString;

import java.util.Arrays;

/**
 * input [0,0,5,9,7] output = [5,9,7,0,0]. order should remain same
 * Two Pointers example
 */
public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr ={5,0,4,0,0,2,7,0};
  /*      moveZer0EndTwoPointer(arr);
       Arrays.stream(arr).forEach(a-> System.out.print(a+" "));
        arr = new int[]{5, 0, 4, 0, 0, 2, 7};*/
        moveZer0Start(arr);
        System.out.println("");
        Arrays.stream(arr).forEach(a-> System.out.print(a+" "));
    }

    private static void moveZer0EndTwoPointer(int[] array) {
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[counter++]=array[i];
            }
        }
        while(counter<array.length)
        {
            array[counter++]=0;
        }
    }


    private static void moveZer0Start(int[] array) {
        int counter = array.length-1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[counter--] = array[i];
            }
        }
        while (counter >= 0) {
            array[counter--] = 0;
        }
    }
}
