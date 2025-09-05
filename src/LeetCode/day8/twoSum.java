package LeetCode.day8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * There will be only one output
 * return index of output, don't add in separate loop
 * use only one for loop
 */
public class twoSum {
    public static void main(String[] args) {
        int[] a = {5,5,6,7,9,11};
        int[] output = twoSumSolution(a , 10);
        System.out.println(Arrays.toString(output));
    }

    static int[] twoSumSolution(int[] a, int target)
    {
        int[] output = new int[2];
        Map<Integer,Integer> arrayElements = new HashMap<>();
        for(int i=0; i<a.length; i++)
        {
            if(arrayElements.containsKey(target-a[i]))
            {
                output[0]=arrayElements.get(target-a[i]);
                output[1]=i;
            }
            arrayElements.put(a[i],i);
        }
        return output;

    }
}
