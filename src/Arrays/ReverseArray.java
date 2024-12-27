package Arrays;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ReverseArray {
    public static void main(String[] args) {
       int[] array={2,3,4,8};
       int start=0,end=array.length-1;
       while(start<end)
       {
           array[start]=array[start]+array[end];
           array[end]=array[start]-array[end];
           array[start]=array[start]-array[end];
            start++;
            end--;
       }
        Arrays.stream(array).forEach(a-> System.out.println(a));
    }


}