package ArraysAndString;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int[] a = {2,3,5,7,9,11};
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
