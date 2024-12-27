package Arrays;

import java.util.*;

/**
 * Target and array will be input and will return count of pairs whose sum is Target, by default -1
 */
public class TwoPairThreeSumFourSum {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,2};
  //      System.out.println(fouSum(arr,8));
        System.out.println(removeElement(arr,3));
        System.out.println(twoPairs(arr,13));
        System.out.println(threeSum(arr));
    }
    public int[] twoSum(int[] nums, int target) {
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
                }
                else if (Integer.valueOf(hashMap.get(target-num))!=indexx) {
                    output[0]=indexx;
                    output[1]=Integer.valueOf(hashMap.get(target-num));
                    break;
                }
            }
            ++indexx;
        }
        return output;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output=new ArrayList<>();
        if(nums[0]==0 && nums[1]==0 && nums[2]==0)
        {
            output.add(new ArrayList<>(List.of(0,0,0)));
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                break;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k) {
                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    output.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
                    j++;
                    k--;
                }
            }
        }
        Set<List<Integer>> uniqueSet = new HashSet<>();
        List<List<Integer>> uniqueLists = new ArrayList<>();
        for (List<Integer> list : output) {
            if (uniqueSet.add(list)) {
                // If the set did not already contain the list it will return true else false
                uniqueLists.add(list);
            }
        }
        return  uniqueLists;
    }

    private static int twoPairs(int[] nums, int target) {
        int output=0;
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            if (nums[start] + nums[end] > target) {
                end--;
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else {
                output++;
                start++;
                end--;
            }
        }
        return output;
    }

    private static int removeElement(int[] arr, int Target) { //return new leng
      ArrayList<Integer> hs= new ArrayList<>();
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]!=Target)
            {
                hs.add(arr[i]);
            }
        }
        int index=0;
        for(Integer i:hs)
        {
            arr[index]=i;
            index++;
        }
     return hs.size();
        }


    private static List<List<Integer>> fouSum (int[] arr, int target) {

        List<List<Integer>> output= new ArrayList<>();
        Set<Set<Integer>> hs=new HashSet<>();
        Arrays.sort(arr);
        for (int i=0;i<arr.length-3;i++) {
            List<Integer> out=null;
            Set<Integer> hs1=null;
            for (int j = i+1; j < arr.length - 2; j++) {
                out= new ArrayList<>();
                hs1= new HashSet<>();
                int left = j + 1, right = arr.length - 1;
                while (left < right) {
                    if (arr[i] + arr[j] + arr[left] + arr[right] > target) {
                        right--;
                    } else if (arr[i] + arr[j] + arr[left] + arr[right] < target) {
                        left++;
                    } else {
                        out.add(arr[i]);
                        out.add(arr[j]);
                        out.add(arr[left]);
                        out.add(arr[right]);
                        hs1.add(arr[i]);
                        hs1.add(arr[j]);
                        hs1.add(arr[left]);
                        hs1.add(arr[right]);
                        left++;
                        right--;
                    }
                }

                if(out.size()!=0 && hs.add(hs1))
                output.add(out);
            }

        }
        return output;
    }

}