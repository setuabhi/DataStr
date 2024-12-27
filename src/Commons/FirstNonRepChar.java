package Commons;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepChar {
    public static void main(String[] args) {
    //    System.out.println( returnIndex("abcdeab"));
        int[] arrr={2,3,5,6,3};
        int[] arr=twoSum(arrr,6);
        System.out.println("Hi");
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, String> hashMap= new HashMap<>();
        int i=0;
        int[] output= new int[2];
        for(int num: nums)
        {
            if(hashMap.containsKey(num))
            {
                hashMap.put(num,hashMap.get(num)+" "+i);
            }
            else
            {
                hashMap.put(num, String.valueOf(i));
            }

++i;
        }
        int indexx=0;
        for(int num: nums)
        {
            if(hashMap.containsKey(target-num))
            {
                if(hashMap.get(target-num).split(" ").length>1)
                {
                    output[0]=indexx;
                    output[1]=Integer.valueOf(hashMap.get(target-num).split(" ")[1]);
                    break;
                } else if (Integer.valueOf(hashMap.get(target-num))!=indexx) {
                    output[0]=indexx;
                    output[1]=Integer.valueOf(hashMap.get(target-num));
                }
            }
++indexx;
        }
return output;
    }

   static int returnIndex(String s)
    {
        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();
        for(char c: s.toCharArray())
        {
            if(linkedHashMap.containsKey(c))
            {
                linkedHashMap.put(c,linkedHashMap.get(c)+1);
            }
            else
            {
                linkedHashMap.put(c,1);
            }
        }
for(int i=0; i<s.length(); i++)
{
    if(linkedHashMap.get(s.charAt(i))==1)
    {
        return i;
    }
}

        return -1;
    }
}
