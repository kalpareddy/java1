class ijk
{
    ijk(String name, int age)
    {
        System.out.println(name + " " + age);
    }
public void det(String name, int age, String branch)
{
    System.out.println(" " + name + " " + age + " " + branch);
}
}
public class const3 {
    public static void main(String[] args) {
        ijk obj1 = new ijk("kalpana",23);
        obj1.det("kalpana", 23,"MCA");

    }
}
