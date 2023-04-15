import java.util.Scanner;
public class Mydemo {
    public static void main(String args[])
    {

        Ahsan a=new Ahsan();
        a.get();
        a.find();
        a.out();
    }
    
}
class Ahsan{
    int n,rev=0;
    Scanner sc=new Scanner(System.in);
public void get()
{
    System.out.println("Enter a no=");
    n=sc.nextInt();
}
public void find()
{
    int r;
    while(n>0)
    {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
}
public void out()
{
    System.out.println("Reverse="+rev);
}
}
