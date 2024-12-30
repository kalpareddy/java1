interface d
{
    void details(String name, String location);
}
public class lambda_expression {
    public static void main(String[] args)
    {
        d obj=(String name, String location)->System.out.println(name+" "+location);
        obj.details("kalpana","gulbarga");
    }
}
