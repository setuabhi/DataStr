package ArraysAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{2, 6},
                             {8, 10},
                             {1, 3},
                             {13,15},
                             {9, 18}};  //Output: {1,6}, {8,18}
        for(int[] output : mergedIntervals(intervals))
        {
            System.out.println(Arrays.toString(output));
        }
    }

    private static List<int[]> mergedIntervals(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparing(a->a[0]));
        merged.add(intervals[0]);
        int currentListIndex=0;
        for(int i=1; i< intervals.length; i++){
            if(intervals[i][0]< merged.get(currentListIndex)[1]) //first element is less than previous array second element
            {
                int[] temp= new int[2];
                temp[0]=merged.get(currentListIndex)[0];
                temp[1]=Math.max(merged.get(currentListIndex)[1],intervals[i][1]);
                merged.remove(currentListIndex);
                merged.add(temp);
            }
            else
            {
                merged.add(intervals[i]);
                currentListIndex++;
            }
        }
        return merged;
    }
}
