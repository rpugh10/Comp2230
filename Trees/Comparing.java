
public class Comparing {

    public static boolean compare(TreeNode node1, TreeNode node2){
        InOrderIterator iterator1 = new InOrderIterator(node1);
        InOrderIterator iterator2 = new InOrderIterator(node2);

        while(iterator1.hasNext() && iterator2.hasNext()){

            int value1 = iterator1.next();
            int value2 = iterator2.next();

            if(value1 != value2){
                return false;
            }
        }

        return !(iterator1.hasNext() || iterator2.hasNext());

    }
}
