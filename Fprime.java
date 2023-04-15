import java.util.Scanner;
public class Fprime {

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int i,n,c,j;
    System.out.println("Enter the no=");
    n=sc.nextInt();
    for(i=2;i<=n;i++)
    {
         c=0;
         j=1;
         while(j<=i)
         {
         if(i%j==0)
         {
            c++;
         }
         j++;
         }
         if(c==2)
         {
            System.out.print("\t"+i);
         }

    }


}
    
}
