interface z
{
    void sum(int a, int b);
}
public class anonymous_interface
{
    public static void main(String[] args)
    {
        z obj = new z() {
            public void sum(int a, int b) {
                System.out.println(a + b);
            }
        };
        obj.sum(4, 2);
    }

}
