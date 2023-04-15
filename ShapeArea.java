import java.util.Scanner;
abstract class Shape {
    int x,y;
    Scanner sc=new Scanner(System.in);
    abstract void print_Area();
    
}
class Circle extends Shape{
    public void print_Area()
    {
        System.out.println("Enter radious of circle=");
        x=sc.nextInt();
        System.out.println("Area of Circle="+(float)(3.14*x*x));

    }
}
class Rectangle extends Shape{
    public void print_Area()
    {
        System.out.println("Enter lenth and breadth of Rectangle=");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Area of Rectangle="+(x*y));
    }
}
class Triangle extends Shape{
    public void print_Area()
    {
        System.out.println("Enter Base and Heihgt of traingle=");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Area of Traingle="+(float)(0.5*x*y));
    }
}
 class  ShapeArea{
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.print_Area();
        Rectangle r=new Rectangle();
        r.print_Area();
        Triangle t=new Triangle();
        t.print_Area();
    }
}