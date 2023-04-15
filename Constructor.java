import java.util.Scanner;
public class Constructor {
    public static void main(String args[]){
        Factorial f=new Factorial();
        f.find();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a no=");
        int x=sc.nextInt();
        Factorial f1=new Factorial(x);
        f1.find2();
    } 
}
 class Factorial{
   int x,a;
    Scanner sc=new Scanner(System.in);
    public  Factorial(){
        System.out.println("Enter a no for find factorial=");
        a=sc.nextInt();   
    }
    public void find()
    {
        long f=1;
        while(a>0)
        {
           f=f*a;
           a--;
        }
        System.out.println("Factorial in Default constructor="+f);
    }
     public  Factorial(int n)
    {
        x=n;
        
    }
    public void find2()
    {
        long f=1;
        while(x>0)
        {
            f=f*x;
            x--;
        }
        System.out.println("Factorial in Parameterised Constructor="+f);
    }
}
