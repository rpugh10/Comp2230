package Comp2230.Recursion.ValueExists;

public class Main {
    public static void main(String[] args) {
        TreeNode root = null;
        root = insertValue(root, 15);
        root = insertValue(root, 20);
        root = insertValue(root, 5);
        root = insertValue(root, 3);

        int numToFind = 3;

        System.out.println("The number " + numToFind + " is in the tree " + search(root, numToFind));
    }

    public static TreeNode insertValue(TreeNode root, int value){
        if(root == null){
            TreeNode node = new TreeNode(value);
            return node;
        }

        if(value < root.getValue()){
            root.setLeft(insertValue(root.getLeft(), value)); 
        }else{
            root.setRight(insertValue(root.getRight(), value));
        }
        return root;
    }

    public static boolean search(TreeNode root, int x){
        if (root == null) return false;

        int value = root.getValue();

        if (x == value) return true; //If we found x
        if(x < value) return search(root.getLeft(), x); // if x is smaller than the value it has to be in the left subtree, 
        return search(root.getRight(), x); // if x is bigger than the value it has to be in the right subtree
    }
}
