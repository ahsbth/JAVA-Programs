/*
      Java Pattern Printing Like This   
        1
        2       2
        3       3       3
        4       4       4       4
 */

import java.util.Scanner;
public class Number2 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,n,k=1;
        System.out.println("Enter the no of term");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("\t"+i);
            }
            System.out.println();
        }
    }
    
}
