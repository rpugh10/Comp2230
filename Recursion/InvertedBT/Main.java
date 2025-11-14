package Comp2230.Recursion.InvertedBT;

public class Main {

    public static void main(String[] args) {
        TreeNode root = null;
        root = insertElement(root, 10);
        root = insertElement(root, 20);
        root = insertElement(root, 5);
        root = insertElement(root, 15);
        root = insertElement(root, 7);

        System.out.println("Tree before inverting ");
        preOrder(root);

        System.out.println("Tree after inverting");
        invert(root);
        preOrder(root);
    }

    public static TreeNode insertElement(TreeNode root, int value){
        if(root == null){
            TreeNode node = new TreeNode(value);
            return node;
        }

        if(value < root.getValue()){
            root.setLeft(insertElement(root.getLeft(), value));
        }
        else{
            root.setRight(insertElement(root.getRight(), value));
        }
        return root;
    }

    public static TreeNode invert(TreeNode root){
        if (root == null) return null;

        TreeNode temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);
        
        invert(root.getLeft());
        invert(root.getRight());
         

        return root;
    }

    public static void preOrder(TreeNode node){
        if(node == null) return;
        System.out.println(node.getValue() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }
}
