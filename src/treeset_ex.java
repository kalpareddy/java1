import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeset_ex {
    public static void main(String[] args) {
        Set<Integer> number=new TreeSet<>() ;
        {
            number.add(10);
            number.add(20);
            number.add(3);
            number.add(5);

            System.out.println(number);
            number.isEmpty();
            System.out.println( number.isEmpty());
            number.hashCode();
            System.out.println( number.hashCode());
        }
    }
}
