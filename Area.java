import java.util.Scanner;
public class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,s;
        System.out.println("Enter the coefficient of a,b and c=");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        float sr=(float)(s*(s-a)*s(s-b)*(s-c));
       double ar=math.sqrt(sr);
        System.out.println("Area of tringle=",ar);


    }
}