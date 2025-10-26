
import java.util.LinkedList;
import java.util.Queue;

public class QueueRotation {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i =0; i < 10; i++){
            queue.add(i);
        }

        System.out.println(queue);
        int number = 5;
        queueRotation(number, queue);
        System.out.println(queue);
    }
    public static Queue<Integer> queueRotation(int number, Queue<Integer> queue){
        if(number > queue.size()){
            throw new RuntimeException("Out of bounds");
        }

        int top = 0;

        while(top < number){
            int temp = queue.remove();
            queue.add(temp);
            top++;
        }

        return queue;
    }

}
