package LeetCode.Day13;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] strArray = {"abc","def","we","are","we","are"};
        System.out.println(Arrays.toString(topKfrequentWords(strArray, 2))); // output should be {"we","are}
    }

    private static String[] topKfrequentWords(String[] strArray, int topK) {
        Map<String,Integer> hm = new HashMap();
        for(String s : strArray)
        {
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        ArrayList<Map.Entry<String,Integer>> arrayList = new ArrayList<>(hm.entrySet());
        arrayList.sort(Comparator.comparing(a->a.getValue(), Collections.reverseOrder()));
        int index=0;
        String[] output= new String[topK];
        while(topK-->0)
        {
            output[index]= arrayList.get(index++).getKey();
        }
        return output;
    }
}
