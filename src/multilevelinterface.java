interface A
{

   void method1();
    void method2();
}
interface B extends A
{
    void method3();
    void method4();

}
class C implements B{
    public void method1()
    {
        System.out.println(" method1");
    }
    public void method2()
    {
        System.out.println(" method2");
    }
    public void method3()
    {
        System.out.println(" method3");
    }
    public void method4()
    {
        System.out.println(" method4");
    }

}


public class multilevelinterface {
    public static void main(String[] args){
        C obj=new C();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
