interface operation
{
    int a=2;
    int b=4;
    void add();
    void sub();
}
class arith implements operation
{
     public void add()
     {
         System.out.println(a+b);
     }
    public void sub()
    {
        System.out.println(a-b);
    }


}
public class interface2 {
    public static void main(String[] args){
        arith obj=new arith();
        obj.add();
        obj.sub();
        System.out.println(operation.a+" "+operation.b);

    }
}
