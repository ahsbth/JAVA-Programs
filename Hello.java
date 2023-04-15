

 import java.util.Scanner;
public class Hello {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a,b,c,d,g;
      System.out.println("Enter 4 nos=") ;
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      d=s.nextInt();
      if(a>b&&a>c&&a>d)
      {
       g=a; 
      }
     else if(b>a&&b>c&&b>d)
     {
        g=b;
     }
     else if(c>a&&c>b&&c>d)
     {
        g=c;
     }
     
     else  
     {
        g=d;
     }
     System.out.println("Greattest value="+g);
    }
    
}
