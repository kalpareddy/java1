class dog
{
    String name="minni";
    int age=2;
    String color="white";

}
class cat
{
    String name="shua";
    int age=1;
    String color="white";

}
class bike
{
    String name="Hero Splendor Plus";
    int price=50000;
    String color="black";
    String fuel="Petrol";

}
class car
{
String name="Maruti Suzuki Alto";
int price=500000;
String color="black";
String fuel="Petrol, CNG";

}
class mobile
{
    String name="mi";
    String ram=" 64gb";
    String rom="4gb";
    int price=150000;

}
public class classandobject1 {
    public static void main(String[] args){
        dog obj1=new dog();
        dog obj2=new dog();
        cat obj3=new cat();
        car obj4=new car();

        bike obj5=new bike();
        mobile obj6=new mobile();

        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.color);
        System.out.println(obj3.name);
        System.out.println(obj3.age);
        System.out.println(obj3.color);
        System.out.println(obj4.name);
        System.out.println(obj4.price);
        System.out.println(obj4.color);
        System.out.println(obj5.name);
        System.out.println(obj5.price);
        System.out.println(obj5.color);
        System.out.println(obj5.fuel);
        System.out.println(obj6.name);
        System.out.println(obj6.ram);
        System.out.println(obj6.rom);
        System.out.println(obj6.price);

    }
}
