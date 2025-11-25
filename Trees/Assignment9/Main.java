

public class Main {

    public static void main(String[] args) {
        
        ModifiedBSTree tree = new ModifiedBSTree(10);

       tree.insert(5);
       tree.insert(10);
       tree.insert(15);
       tree.insert(20);
       tree.insert(3);
       tree.insert(1);
        
        System.out.println("Level order printing: " + tree.toString());
        
    }
}
