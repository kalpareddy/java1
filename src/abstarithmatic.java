abstract class abcd
{
    abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void div();

}
class xyz extends abcd
{
    @Override
    void add() {
        int a=4;
        int b=2;
        System.out.println("add "+(a+b));
    }
    void sub() {
        int a=4;
        int b=2;
        System.out.println("sub "+(a-b));
    }
    void mul() {
        int a=4;
        int b=2;
        System.out.println("mul "+(a*b));
    }
    void div() {
        int a=4;
        int b=2;
        System.out.println("div "+(a/b));
    }
}

public class abstarithmatic {
    public static void main(String[] args) {
        xyz obj = new xyz();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }

}
