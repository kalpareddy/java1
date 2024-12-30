class E
{
    int a;
    public void add()
    {
        System.out.println("addition");
    }
    class F {
        public void sub() {
            System.out.println("subatraction");
        }
    }
}
public class nestedcls {
    public static void main(String[] args){
        E obj=new E();
        E.F obj1=obj.new F();
        obj.add();
        obj1.sub();
    }
}
