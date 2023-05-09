package EXAMPREP;
import java.util.Scanner;
public class MethodeOveride {
    public static void main(String argsp[])
    {
        Palindrome p=new Palindrome();
        p.get();
        p.display();
        
    }
}
class Reverse{
    Scanner sc=new Scanner(System.in);
    int a,r,rev=0;
    public void get()//Methode Overridding(Base/Parent/Super Class Methode)
    {
        System.out.println("Enter the  no for find reverse");
         int a=sc.nextInt();
         while(a>0)
         {
            r=a%10;
            rev=rev*10+r;
            a=a/10;

         }
        
    }
    public void display()
    {
    System.out.println("Reverse="+rev);
    }
}
class  Palindrome extends Reverse{
    int r,rev=0,m;
    public void get()//Methode Overridding(Derived/Child/Sub Class Method)
    {
        System.out.println("Enter a no for find Palindrome=");
        int n=sc.nextInt();
         m=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
       
        
    }
    public void display()
    {
        if(m==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        super.get();
        super.display();
    }
}


    
