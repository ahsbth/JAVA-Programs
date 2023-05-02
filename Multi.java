import java.util.Scanner;
public class Multi {
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of row and column for First Matrix=");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter no of row and column for Second Matrix=");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int A[][]=new int[r1][c1];
        int B[][]=new int[r2][c2];
       // int C[][]=new int[c1][r2];
       int i,j;
       
        System.out.println("Enter value for First matrix=");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter value for Second matrix=");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }
        
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
               System.out.print("\t"+A[i][j]);
            }
            System.out.println("\n");
        }

        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
               System.out.print("\t"+B[i][j]);
            }
            System.out.println("\n");
        }

    }
}
