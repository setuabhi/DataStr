package ArraysAndString.ChatGbt;

import java.util.ArrayList;
import java.util.List;

public class SubarrayGenerator {
    public static void printAllSubarraysN2(int[] array) {
        List<List<Integer>> subArray= new ArrayList<>();
        for (int start = 0; start < array.length; start++) {
            List<Integer> subarr = new ArrayList<>();
            for (int end = start; end < array.length; end++) {
                subarr.add(array[end]);
                subArray.add(new ArrayList<>(subarr)); //Think why new is required
            }
        }
        for (List<Integer> subarr : subArray) {
            System.out.println(subarr);
        }
        System.out.println("Done");
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        printAllSubarraysN2(array);
    }
}
