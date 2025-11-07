
import java.util.Stack;

public class InOrderIterator {

    private Stack<TreeNode> stack = new Stack<>();

    public InOrderIterator(TreeNode root){
        pushLeft(root);
    }

    public void pushLeft(TreeNode node){
        while(node != null){
            stack.push(node);
            node = node.getLeft();
        }
    }

    public boolean hasNext(){
        return !stack.isEmpty();
    }

    public int next(){
        TreeNode node = stack.pop();
        int value = node.getValue();
        if(node.getRight() != null){
            pushLeft(node.getRight());
        }
        return value;
    }
}
