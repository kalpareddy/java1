abstract class details123
{
    abstract void officeworkdetails(int id,int login_hrs);

}
class def extends details123{
    void officeworkdetails(int re_hrs,int sleeping_hrs){
        System.out.println("re_hrs "+re_hrs+" "+sleeping_hrs);
    }
    void persnalworkdetails(String name, int age){
        System.out.println("name "+name+" "+"age "+age);
    }

}
public class program1 {
    public static void main(String[] args){
        def obj=new def();
        obj.officeworkdetails(123,4);
        obj.officeworkdetails(3,4);
        obj.persnalworkdetails("kalpana",23);
    }
}
