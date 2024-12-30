class e1
{
    e1(String name, String role ,int salary ,String gender)
    {
        System.out.println("e1 details"+ " "+name+" "+role+" "+gender);
    }
    e1(String name, int age,String location,int experience)
    {
        System.out.println("e1 details"+ " "+name+" "+age+" "+experience+" "+location);
    }
    public void h1(String name, String id,String company_name)
    {
        System.out.println("e1 details"+ " "+name+" "+company_name);
    }
    public void d1(String dep_id, String dep_name,String location)
    {
        System.out.println("d1 details"+ " "+dep_id+" "+dep_name+" "+location );
    }
}
public class employee {
    public static void main(String[] args) {
        e1 obj1=new e1("kalpana","manager", 200000,"female");
        e1 obj2=new e1("kalpana",23, "bengaluru",24);
        obj1.h1("kavya", "123","MNC");
        obj1.d1("123","MNC","BENGALORE");

    }
}
