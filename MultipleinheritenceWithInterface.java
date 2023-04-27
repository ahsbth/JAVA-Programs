import java.util.Scanner;
public class MultipleinheritenceWithInterface{
    public static void main(String args[])
    {
       Rectangle r=new Rectangle();
       find f=r;
       f.area();
       f.perimeter();
       r.put();
    }
}
class Data{
float l,b;
Scanner sc=new Scanner(System.in);
void input()
{
    System.out.println("Enter the lenth and breadth of Rectangle=");
    l=sc.nextFloat();
    b=sc.nextFloat();
}
}
interface find{
    void area();
    void perimeter();
}
class Rectangle extends Data implements find{
    float a,p;
    public void area()
    {  input();
       a=l*b;
    }
    public void perimeter()
    {
     p=2*(l+b);
    }
    void put()
    {   
        
        System.out.println("Area of Rectangle="+a);
        System.out.println("Perimeter of Rectangle="+p);

    }
}
