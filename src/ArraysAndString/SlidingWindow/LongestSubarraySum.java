package ArraysAndString.SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class LongestSubarraySum {

    public static void main(String[] args) {
        Integer[] arr = {5, 3, 0, 0, 1, 4, 9}; // Example input
        //Output startIndex and endIndex, here is should be 2 , 5 i.e. [0, 0, 1, 4]
        System.out.println(Arrays.toString(longestSubarrayWithSumLessThanOrEqualToMax(arr, 5)));
    }

    private static int[] longestSubarrayWithSumLessThanOrEqualToMax(Integer[] arr, int max) {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        int output[] = new int[2];
        Deque<Integer> deque = new ArrayDeque<>();
        int currSum = 0, maxArraySize=0;
        int firstIndex=0, lastIndex=0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            deque.add(arr[i]);
            while (currSum > max) {
                currSum -= deque.pollFirst();
            }
           if(deque.size()>maxArraySize)
           {
               firstIndex=arrList.indexOf(deque.peekFirst());
               lastIndex=arrList.indexOf(deque.peekLast());
               maxArraySize=deque.size();

           }

        }
        output[0]=firstIndex;
        output[1]=lastIndex;
        return output;
    }
}
