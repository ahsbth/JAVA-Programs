import java.util.Scanner;
public class Greatter {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter value of no=");
      int n=sc.nextInt();
      int a[]=new int[n];
      int i;
      System.out.println("Enter the nos");
      for(i=0;i<n;i++)
      {
         a[i]=sc.nextInt();
      }
      int g=a[0];
      for(i=0;i<n;i++)
      {
        if(a[i]>g)
        {
            g=a[i];
        }
      }
      System.out.println("Greatest="+g);

    }
    
}
