import java.util.Scanner;

public class matixmultiplication {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int row= sc.nextInt();
        int col= sc.nextInt();
        int[][] a=new int[row][col];
        int[][] b=new int[row][col];
        int[][] mulmatrix=new int[row][col];
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
        System.out.println("mul of the matrix");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                for (int k = 0; k< col; k++)
                {
                    mulmatrix[i][j]= mulmatrix[i][j]+a[i][j]*b[k][j];
                }

            }

        }
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(mulmatrix[i][j]+" ");
            }

        }

    }
}

