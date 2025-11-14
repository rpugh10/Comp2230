package Comp2230.Recursion.SumLeaf;


public class Main {

    public static void main(String[] args){
        TreeNode root = null;
        root = insertElement(root,15);
        root = insertElement(root, 20);
        root = insertElement(root, 5);

        System.out.println("The sum of the leaves are " + sumOfLeafNodes(root));
    }

    public static TreeNode insertElement(TreeNode root, int element){
        if(root == null){
            TreeNode node = new TreeNode(element);
            return node;
        }

        if(element < root.getValue()){
            root.setLeft(insertElement(root.getLeft(), element));
        }else{
            root.setRight(insertElement(root.getRight(), element));
        }
        return root;
    }

    public static int sumOfLeafNodes(TreeNode root){
        if(root == null) return 0;

        if(root.getLeft() == null && root.getRight() == null){
            return root.getValue();
        }

        return sumOfLeafNodes(root.getLeft()) + sumOfLeafNodes(root.getRight());
    }
}
