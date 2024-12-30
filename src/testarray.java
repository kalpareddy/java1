public class testarray {
    public static void main(String[] args){
        double[] mylist={1.9,2.9,3.4,3.5};
        for (int i = 0; i < mylist.length ; i++) {
            System.out.println(mylist[i]+" ");
        }
        double sum=0;
        for(int i = 0; i < mylist.length ; i++)
        {
            sum+=mylist[i];
        }
        System.out.println("sum is "+sum);
    }
}
