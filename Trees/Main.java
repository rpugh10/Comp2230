
public class Main {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(15);
        node1.left = new TreeNode(7);
        node1.right = new TreeNode(25);
        node1.left.left = new TreeNode(2);
        node1.left.right = new TreeNode(18);

        TreeNode node2 = new TreeNode(15);
        node2.left = new TreeNode(7);
        node2.right = new TreeNode(25);
        node2.left.left = new TreeNode(2);
        node2.left.right = new TreeNode(18);
        
        System.out.println("Trees are the same : " + Comparing.compare(node1, node2));

        TreeNode node3 = new TreeNode(15);
        node1.left = new TreeNode(7);
        node1.right = new TreeNode(25);
        node1.left.left = new TreeNode(2);
        node1.left.right = new TreeNode(18);

        TreeNode node4 = new TreeNode(20);
        node2.left = new TreeNode(13);
        node2.right = new TreeNode(23);
        node2.left.left = new TreeNode(5);
       
        System.out.println("Trees are the same : " + Comparing.compare(node3, node4));
    }
}
