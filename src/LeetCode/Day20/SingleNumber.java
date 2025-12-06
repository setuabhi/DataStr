package LeetCode.Day20;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,1,2,3};
        int output=0;
        for(int i : arr)
        {
           output= output^i;
        }
        System.out.println(output);
    }
}
