package LeetCode.Day14_15_16;

public class ValidateBST {
    public static void main(String[] args) {
        /*
                 13
               /     \
             10        15
           /  \      /   \
          7   12    14    16

           */
        Tree root = new Tree(13);
        root.left = new Tree(10);
        root.left.left = new Tree(7);
        root.left.right = new Tree(12);
        root.right = new Tree(15);
        root.right.left = new Tree(14);
        root.right.right = new Tree(16);
        System.out.println(ValidateBSTOrNot(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    private static boolean ValidateBSTOrNot(Tree root, int minValue, int maxValue) {
        if (root == null) return true; // we have reached leaf
        if (!(root.data > minValue && root.data < maxValue)) return false;
        return ValidateBSTOrNot(root.left, minValue, root.data) &&
                ValidateBSTOrNot(root.right, root.data, maxValue);
    }
}
