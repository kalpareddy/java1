@FunctionalInterface
interface r{
 int sum(int a,int b);
}
public class lambda_abstract {
    public static void main(String[] args)
    {
        r obj =(a,b)->(a+b);
        int result=obj.sum(4, 2);
        System.out.println(result);
    }

}
