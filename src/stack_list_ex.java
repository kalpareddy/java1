import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class stack_list_ex {
    public static void main(String[] args) {
        Stack<Integer> l= new Stack<>();
        l.add(1);
        l.add(4);
        l.add(7);
        l.add(3);
        l.add(2);
        System.out.println(l);
        // l.remove(1);
        l.pop();

        System.out.println(l);
        l.push(9);
        System.out.println(l);
        l.remove(3);
        System.out.println(l);
    }
}
