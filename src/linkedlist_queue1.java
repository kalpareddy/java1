import java.util.LinkedList;
import java.util.Queue;

public class linkedlist_queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(5);
        queue.offer(3);
        queue.offer(7);
        System.out.println(queue);
        // System.out.println("remove element: "+queue.poll());
        System.out.println("front element: "+queue.peek());

    }
}
