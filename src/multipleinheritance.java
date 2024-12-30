interface swimmer
{
    void swim();
}
interface flyer
{
    void fly();
}
class bird implements swimmer,flyer
{
    public void swim()
    {
        System.out.println("birds can swim");
    }
    public void fly()
    {
        System.out.println("birds can fly");
    }

}
public class multipleinheritance {
    public static void main(String[] args){
    bird obj =new bird();
    obj.swim();
    obj.fly();
    }
}
