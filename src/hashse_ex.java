import java.util.HashSet;
import java.util.Set;

public class hashse_ex {
    public static void main(String[] args) {
        Set<String> fruit=new HashSet<>() ;
        {
            fruit.add("Apple");
            fruit.add("Banana");
            fruit.add("Banana");
            System.out.println(fruit);
        }
    }
}
