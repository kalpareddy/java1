class cls1
{
    public void person(String name,int age)
    {
        System.out.println("name"+" "+name+" age "+age);
    }
    class cls2
    {
        public void emp(int id,String name,int salary)
        {
            System.out.println(" id "+id+" name "+name+ " salary "+salary);

        }
    }
    class cls3
    {
        public void dep(int id,String name)
        {
            System.out.println(" id "+id+" name "+name);

        }
    }
    class cls4
    {
        public void hr(String name, String location)
        {
            System.out.println(" name "+name+ " location "+location);

        }
    }

}
public class multiple_nested_cls {
    public static void main(String[] args)
    {
        cls1 obj=new cls1();
        cls1.cls2 obj1=obj.new cls2();
        cls1.cls3 obj2=obj.new cls3();
        cls1.cls4 obj3=obj.new cls4();
        obj.person("kalpana",24);
        obj1.emp(233,"kalpana",20000);
        obj2.dep(123,"kalpana");
        obj3.hr("kalpana","bengaluru");

    }
}
