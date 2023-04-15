

/* 
   Java pattern Like This
0

1       2

3       4       5

*/
import java.util.Scanner;
public class Number {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n,i,j;
       int k=0;
       System.out.println("Enter no terms=");
       n=sc.nextInt();
       for(i=0;i<n;i++)
       {
        for(j=0;j<=i;j++)
        {
            
            System.out.print("\t"+k++);
        }
        System.out.println("\n");
       }
    }
    
}
