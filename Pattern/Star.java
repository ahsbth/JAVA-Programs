/*
      Java Pattern Like this
        
        *

        *       *

        *       *       *

        *       *       *       *
 */
import java.util.Scanner;
public class Star {
    public static void main(String args[])
    {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no line=");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("\t*");
            }
            System.out.println("\n");
        }
    }
    
}
