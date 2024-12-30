import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collection_linkedlist {
    public static void main(String[] args) {
        List<String> l= new LinkedList<String>() ;
        l.add("kalpana");
        l.add("reddy");
        l.add("VJVM");
        l.add("CPM");
        l.add("sharnbasva university");
        l.add("4");
        System.out.println(l);
        l.add(2,"branch:cs");
        System.out.println(l);
        l.add(4,"bengaluru");
        System.out.println(l);
        l.remove("VJVM");
        System.out.println(l);
        l.remove(4);
        System.out.println(l);
        l.lastIndexOf("4");
        System.out.println(l);


    }
}
