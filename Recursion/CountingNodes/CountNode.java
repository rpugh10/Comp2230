package Comp2230.Recursion.CountingNodes;

public class CountNode {

    public TreeNode insertValue(TreeNode root, int value){
        if(root == null){
            TreeNode node = new TreeNode(value);
            return node;
        }

        if(value < root.getData()){
            root.setLeft(insertValue(root.getLeft(), value)); 
        }else{
            root.setRight(insertValue(root.getRight(), value));
        }
        return root;
    }

    public int sumOfNodes(TreeNode root){
        if(root == null) return 0;
        
        int sum = root.getData();
        sum += sumOfNodes(root.getLeft());
        sum += sumOfNodes(root.getRight());
        return sum;
    }
}
