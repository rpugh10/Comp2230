package Comp2230.Recursion.CountingNodes;

public class Main {
    public static void main(String[] args) {
        TreeNode root = null;
        CountNode node = new CountNode();

        root = node.insertValue(root, 19);
        root = node.insertValue(root, 32);
        root = node.insertValue(root, 12);
        root = node.insertValue(root, 3);
        root = node.insertValue(root, 55);
        root = node.insertValue(root, 11);

        System.out.println("The sum of the tree is " + node.sumOfNodes(root));
       
    }
}
