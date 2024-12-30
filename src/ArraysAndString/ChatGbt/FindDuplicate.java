package ArraysAndString.ChatGbt;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] a = {2,3,5,7,88,9,11};
        System.out.println("Duplicate: " + duplicate(a));
    }
    static int duplicate(int[] a)
    {
        Set<Integer> arrayElements = new HashSet<>();
        for (int element: a)
        {
            if(!arrayElements.add(element))
            {
                return element;
            }
        }
        throw new RuntimeException("Couldn't find element");
    }
}
