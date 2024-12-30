import java.util.Scanner;

public class multidimentionaarrayuserin {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int row= sc.nextInt();
        int col= sc.nextInt();
        int[][] a=new int[row][col];
        int[][] b=new int[row][col];
        int[][] summatrix=new int[row][col];
        System.out.println("enter the values for first matrix");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                a[i][j]= sc.nextInt();
            }

        }
        System.out.println("enter the values for second matrix");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                b[i][j]= sc.nextInt();
            }

        }
        System.out.println("sum of the matrix");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                summatrix[i][j]=a[i][j]+b[i][j];
            }

        }
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(summatrix[i][j]+" ");
            }

        }

    }
}
