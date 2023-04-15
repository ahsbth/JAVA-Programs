import java.util.Scanner;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
public class Multi {
    public static void main(String args[])
    {
        int A[][]=new int[r1][c1];
        int B[][]=new int[r2][c2];
        int C[][]=new int[c1][r2];
        int i,j,k,sum,r1,c1,r2,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of row and column for First Matrix=");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter no of row and column for Second Matrix=");
        r2=sc.nextInt();
        c2=sc.nextInt();
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
               System.out.print("/t"+A[i][j]);
            }
            System.out.println("\n");
        }

        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
               System.out.print("/t"+B[i][j]);
            }
            System.out.println("\n");
        }

    }
}
