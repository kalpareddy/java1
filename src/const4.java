class lorry
{
    lorry(String color, int price,String Tyre_size)
    {
        System.out.println("lorry   "+color + " " + price+" "+Tyre_size);
    }
    lorry(String color, int price)
    {
        System.out.println("lorry   "+color + " " + price+" ");
    }
    public void car(String name, String color, int price)
    {
        System.out.println("carr  " + name + " " + color + " " + price);
    }
    public void bike(String name, String color)
    {
        System.out.println(" bike " + name + " " + color );
    }
}
public class const4 {
    public static void main(String[] args) {
        lorry obj2 = new lorry("black",1000,"24.5");
        lorry obj1 = new lorry("black",1000);
        obj2.car("toyoto","black",2300);
        obj2.bike("R15","black");

    }
}
