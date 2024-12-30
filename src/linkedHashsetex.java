import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashsetex {
    public static void main(String[] args) {
        // Set<Integer> number=new LinkedHashSet<>() ;
        // {
        //  number.add(3);
        //  number.add(1);
        //  number.add(6);
        //  System.out.println(number);
        // }
        Set<String> fruit=new LinkedHashSet<>() ;
        {
            fruit.add("Apple");
            fruit.add("Banana");
            fruit.add("Apple");
            System.out.println(fruit);
        }
    }
}
