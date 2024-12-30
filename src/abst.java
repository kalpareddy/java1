abstract class shape
{
    abstract void draw();

}
class circle extends shape
{
    @Override
    void draw() {
        System.out.println(" drawing a circle");
    }
}
public class abst {
    public static void main(String[] args)
    {
        circle obj=new circle();
        obj.draw();
    }
}
