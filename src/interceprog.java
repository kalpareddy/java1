interface animal
{
    void eat();
    void travel();
}
class mammal implements animal
{
    public void eat()
    {
        System.out.println(" mammals eat");

    }
    public void travel()
    {
        System.out.println(" mammals travel");

    }

}
public class interceprog {
    public static void main(String[] args){
        mammal obj=new mammal();
        obj.eat();
        obj.travel();
    }
}
