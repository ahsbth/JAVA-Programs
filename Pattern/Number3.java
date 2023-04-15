/*
     java Pattern printing like this
        4       4       4       4       4

        3       3       3       3

        2       2       2

        1       1

        0
 */
import java.util.Scanner;
public class Number3 {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int i,j,n;
       System.out.println("Enter the no of term=");
       n=sc.nextInt();
       for(i=n;i>=0;i--)
       {
        for(j=0;j<=i;j++)
        {
            System.out.print("\t"+i);
        }
        System.out.println("\n");
       }
    }
    
}
