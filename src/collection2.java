import java.util.ArrayList;
import java.util.Collection;

public class collection2 {
    public static void main(String[] args) {
        Collection<String> names= new ArrayList<String>();
        names.add("kalpa");
        names.add("shree");
        names.add("kalpa");
        names.remove("kavi");


        System.out.println("names"+names);
    }
}
