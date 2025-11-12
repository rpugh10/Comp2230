package Comp2230.Recursion.CountLeaf;

public class Main {

    public static void main(String[] args) {
        TreeNode root = null;
        root = insertNode(root, 15);
        root = insertNode(root, 20);
        root = insertNode(root, 5);
        root = insertNode(root, 3);

        System.out.println("This tree has " + countLeaves(root) + " leaves");
    }

    public static <T extends Comparable<T>> TreeNode<T> insertNode(TreeNode<T> root, T value){
       if(root == null){
            TreeNode<T> node = new TreeNode<>(value);
            return node;
       }

       if(value.compareTo(root.getValue()) < 0){
            root.setLeft(insertNode(root.getLeft(), value));
       } else if (value.compareTo(root.getValue()) > 0) {
            root.setRight(insertNode(root.getRight(), value));
       }
       
       return root;
    }

    public static <T extends  Comparable<T>> int countLeaves(TreeNode<T> root){
        if(root == null) return 0;

        // If both children are null, this node is a leaf.
        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }

        // Otherwise sum the leaf counts of the subtrees.
        return countLeaves(root.getLeft()) + countLeaves(root.getRight());
    }
}
