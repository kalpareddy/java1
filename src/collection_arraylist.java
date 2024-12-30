import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collection_arraylist {
    public static void main(String[] args) {
        List l= new ArrayList();
        l.add("kalpana");
        l.add("bengaluru");
        l.add("south indian");
        l.add(7);
        l.add("23");
        l.add("gulbarga");
        l.remove("south indian");
        l.isEmpty();
        System.out.println(l.isEmpty());
    }
}
