import java.util.ArrayList;
import java.util.Collection;

public class collection1 {
    public static void main(String[] args) {
        Collection<Integer> number= new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.remove(20);

        System.out.println(number);
    }
}
