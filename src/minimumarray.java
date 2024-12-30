public class minimumarray {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        int min=a[0];
        for (int i = 0; i <a.length ; i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }

        }
        System.out.println(min);
        int sum=0;
        for(int i = 0; i < a.length ; i++)
        {
            sum+=a[i];
        }
        System.out.println("sum is "+sum);
        int avg=0;
        for(int i = 0; i < a.length ; i++)
        {
            avg=sum/a.length;
        }
        System.out.println("average is "+avg);
    }
}
