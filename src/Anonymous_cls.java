abstract class p
{
    public abstract void sum(int a,int b);
    public abstract void sub(int a,int b);
    public abstract void mul(int a,int b);
    public abstract void div(int a,int b);

}
public class Anonymous_cls {
    public static void main(String[] args){
        p obj=new p()
        {
            public void sum(int a,int b)
            {
                System.out.println(a+b);
            }
            public void sub(int a,int b)
            {
                System.out.println(a-b);
            }
            public void mul(int a,int b)
            {
                System.out.println(a*b);
            }
            public void div(int a,int b)
            {
                System.out.println(a/b);
            }
        };
        obj.sum(5,4);
        obj.sub(4,2);
        obj.mul(5,4);
        obj.div(8,4);

    }
}








