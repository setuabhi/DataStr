package LeetCode.Day14_15_16;

import java.util.LinkedList;
import java.util.Queue;

public class BFSLevelOrder {
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
        levelorderTraverse(root); // 2 3 4 7 5 6 (left root right)
    }


    private static void levelorderTraverse(Tree root) {
        if (root == null) return;
        Queue<Tree> queue = new LinkedList<>();
        int level = -1;
        queue.offer(root);
        while (!queue.isEmpty()) {
            Tree current = queue.poll();
            System.out.print(current.data);
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }

        System.out.println("Levels= "+level);
    }
}
