package LeetCode.Day9;

public class ConvrtArrayToList {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 78};
        LinkedList head = covtToList(nums);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    private static LinkedList covtToList(int[] nums) {
        LinkedList dummy = new LinkedList(-1);
        LinkedList temp =dummy;
        for (int i = nums.length - 1; i >= 0; i--) {
            LinkedList temp1 = new LinkedList(nums[i]);
            temp.next = temp1;
            temp = temp1;
        }
        return dummy.next;
    }
}
