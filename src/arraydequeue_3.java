import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class arraydequeue_3 {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue= new ArrayDeque<>();
        queue.offer(5);
        queue.offer(3);
        queue.offer(7);
        queue.offer(7);
        queue.push(7);
        System.out.println(queue);
        // System.out.println("remove element: "+queue.poll());
        System.out.println("front element: "+queue.peek());
    }
}
