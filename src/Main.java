import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner Sc=new Scanner(System.in);
        int row=Sc.nextInt();
        for (int i = 0; i <row ; i++) {
            for(int j=0;j<row-i-1;j++){
                System.out.println(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.println("*");
            }
            System.out.println(" ");


        }
    }
}