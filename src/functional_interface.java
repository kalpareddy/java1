interface i
{
    void sum(int a, int b);
}
public class functional_interface {
    public static void main(String[] args)
    {
        i obj = (int a, int b) -> System.out.println(a + b);

        obj.sum(4, 4);
    }

}
