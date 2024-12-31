package ArraysAndString.ChatGbt;

import java.util.*;

// Two Pointers example
public class ReverseArray {
    public static void main(String[] args) {
       int[] array={2,3,4,8};
       int start=0,end=array.length-1;
       while(start<end) //Simply swapping two variables without use of 3rd
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