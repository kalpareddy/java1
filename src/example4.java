interface ex
{
    int mul(int a,int b,int c);
}
public class example4 {
    public static void main(String[] args){
        ex obj=( a, b, c) ->(a*b*c);
        int result=obj.mul(2,3,4);
        System.out.println(result);
    }
}
