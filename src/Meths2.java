class demo
{
    public void add(int a,int b)
    {
        System.out.println("add="+(a+b));
    }
    public void div(int a,int b)
    {
        System.out.println("div="+(a/b));
    }
    public void mul(int a,int b)
    {
        System.out.println("multiplication="+(a*b));
    }
    public int sub(int a,int b)
    {
        return a-b;
    }

}
public class Meths2 {
    public static void main(String[] args) {
        demo obj1 = new demo();
        obj1.add(4, 1);
        obj1.div(4, 1);
        obj1.mul(4, 1);
        int result=obj1.sub(4, 1);
        System.out.println("sub=" + result);
    }
}
