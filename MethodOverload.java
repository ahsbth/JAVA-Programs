import java.util.Scanner;
public class MethodOverload 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr radious of circle=");
        float r=sc.nextInt();
        System.out.println("Enter lenth and breadth of Recatngle=");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter base and height of Traingle=");
        float br=sc.nextFloat();
        float h=sc.nextFloat();
        Methode m=new Methode();
        m.area(r);
        m.area(l,b);
        m.area(br,h);
    }
    
}
class Methode{
    public void area(float r)
    {
        System.out.println("Area of circle="+(3.14*r*r));

    }
    public void area(int l,int b)
    {
       System.out.println("Area of Rectangle="+(l*b));
    }
    public void area(float ln,float br)
    {
      System.out.println("Area of Traingle="+(0.5*(ln+br)));
    }
}