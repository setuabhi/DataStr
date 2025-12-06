package LeetCode.Day14_15_16;

public class DFSTraversal {
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
        root.left.left= new Tree(7);
        root.right= new Tree(4);
        root.right.left= new Tree(5);
        root.right.right= new Tree(6);
        inorderTraverse(root); // 7 3 2 5 4 6 (left root right)
        System.out.println(" ");
        preorderTraverse(root); // 2 3 7 4 5 6 (root left right)
        System.out.println(" ");
        postorderTraverse(root); // 7 3 5 6 4 2 (left right root)
    }

    private static void inorderTraverse(Tree root) {
        if (root==null) return;
        inorderTraverse(root.left);
        System.out.print(root.data);
        inorderTraverse(root.right);
    }
    private static void preorderTraverse(Tree root) {
        if (root==null) return;
        System.out.print(root.data);
        preorderTraverse(root.left);
        preorderTraverse(root.right);
    }
    private static void postorderTraverse(Tree root) {
        if (root==null) return;
        postorderTraverse(root.left);
        postorderTraverse(root.right);
        System.out.print(root.data);
    }
}
