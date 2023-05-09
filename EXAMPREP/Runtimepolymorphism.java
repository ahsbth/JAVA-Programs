package EXAMPREP;
 class Shape{
    public void draw()
    {
        System.out.println("Draw a Shape");
    }
    public void erase()
    {
        System.out.println("Erase a Shape");
    }
}
class  Circle extends Shape{
  public void draw()
  {
    System.out.println("Draw a circle");
  }  
  public void erase()
  {
    System.out.println("Erase a circle");
  }
}
class Triangle extends Shape{
    public void draw()
    {
        System.out.println("Draw a Triangle");
    }
    public void erase()
    {
        System.out.println("Erase a Triangle");
    }
}
class Square extends Shape{
    public void draw()
    {
        System.out.println("Draw a Square");
    }
    public void erase()
    {
        System.out.println("Erase a Square");
    }
}
public class Runtimepolymorphism{
    public static void main(String[] args)
    {
        Circle c=new Circle();
        c.draw();
        c.erase();
        Triangle t=new Triangle();
        t.draw();
        t.erase();
        Square s=new Square();
        s.draw();
        s.erase();
    }
}
