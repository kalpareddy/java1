import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class collection_vectors {
    public static void main(String[] args) {
        List<Integer> name=new Vector<Integer>();
        name.add(10);
        name.add(20);
        name.add(30);
        name.add(40);
        name.add(50);
        System.out.println(name);

        name.remove(2);
        System.out.println(name);
        name.add(3,60);
        System.out.println(name);
        name.add(70);
        name.remove(1);
        System.out.println(name);
        Collections.sort(name);
        System.out.println(name);

    }
}
