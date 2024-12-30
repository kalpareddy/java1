class details
{
    public void s1(String name,int age,String branch,int rollNo)
    {
        System.out.println( "s1 name " +name+" age "+age+" branch "+branch+" rollNo "+rollNo);
    }
    public void s2(String name,int age ,String branch)
    {
        System.out.println("s2 name " +name+" age "+age+" branch "+branch );
    }
    public void t1(String name,int age)
    {
        System.out.println("t1 name "+name+" age "+age);
    }
}
public class meths3 {
    public static void main(String[] args){
        details obj1=new details();
        obj1.s1("kalpana",23,"mca",53);
        obj1.s2("shree",23,"mca");
        obj1.t1("kaveri",25);

    }
}
