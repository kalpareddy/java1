import java.util.LinkedList;
import java.util.Queue;

public class linkedlist_queue {
    public static void main(String[] args)
    {
        Queue<String> queue= new LinkedList<>();
        queue.offer("apple");
        queue.offer("banana");
        queue.offer("cherry");
        System.out.println(queue);
        // System.out.println("remove element: "+queue.poll());
        System.out.println("front element: "+queue.peek());
    }
}
