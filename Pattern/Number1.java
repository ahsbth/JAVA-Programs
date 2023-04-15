/*
 Pattern Like This
  
        1

        1       2

        1       2       3

        1       2       3       4 
 */


import java.util.Scanner;
public class Number1 {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int i,j,n;
     System.out.println("Enter the no of term=");
     n=sc.nextInt();
     for(i=0;i<=n;i++)
     {
        for(j=1;j<=i;j++)
        {
            System.out.print("\t"+j);
        }
        System.out.println("\n");
     }

    }
    
}
