interface X
{
    void method1();
    void method2();
}
class Y implements X
{
    public void method1()
    {
        System.out.println("method 1");
    }
    public void method2()
    {
        System.out.println("method 2");
    }

}
class Z extends Y
{
    public void method1()
    {
        System.out.println("method 1");
    }
    public void method2()
    {
        System.out.println("method 2");
    }


}

public class hiraechicalinterface {
    public static void main(String[] args)
    {
        Z obj=new Z();
        obj.method1();
        obj.method2();

    }
}
