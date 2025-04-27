package ArraysAndString.SlidingWindow;

import java.util.*;

public class LongestSubarraySum {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3}; // Example input
        //Output startIndex and endIndex, here is should be 2 , 5 i.e. [0, 0, 1, 4]
     //   System.out.println(Arrays.toString(longestSubarrayWithSumLessThanOrEqualToMax(arr, 5)));
        System.out.println(subArrays(arr));
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

    private static int[] longestSubarrayWithSumLessThanOrEqualToMaxWithoutDequee(Integer[] arr, int max) {
        int sum = 0, left = 0, outputLeft = 0, outputRight = -1, maxLen = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > max) {
                sum -= arr[left];
                left++;
            }

            int windowSize = right - left + 1;
            if (windowSize > maxLen) {
                maxLen = windowSize;
                outputLeft = left;
                outputRight = right;
            }
        }
        return new int[]{outputLeft, outputRight};
    }

    private static List<List<Integer>> subArrays(Integer[] array)
    {
        List<List<Integer>> output= new ArrayList<>();
        for(int i=0 ; i<array.length; i++)
        {
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j<array.length;j++)
            {
                temp.add(array[j]);
                output.add(new ArrayList<>(temp));
            }
        }
        return output;
    }
}
