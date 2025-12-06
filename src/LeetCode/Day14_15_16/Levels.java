package LeetCode.Day14_15_16;

import java.util.LinkedList;
import java.util.Queue;

public class Levels {
    public static void main(String[] args) {
        /*
                 2
               /   \
             3       4
           /       /   \
          7       5     6

           */
        Tree root = new Tree(2);
        root.left = new Tree(3);
        root.left.left = new Tree(7);
        root.right = new Tree(4);
        root.right.left = new Tree(5);
        root.right.right = new Tree(6);
        System.out.println(findLevels(root));
    }

    private static int findLevels(Tree root) {
        if (root == null) return 0;
       return 1+Math.max(findLevels(root.left),findLevels(root.right));
    }
}
