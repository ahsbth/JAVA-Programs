class Super{
    int x=10;
    public void show()
    {
        System.out.println("hello Super class");
        System.out.println(x);
    }
}
class Sub extends Super{
    int y=10;
    public void disp()
    {
        System.out.println("hello Sub class");
        System.out.println(y);
    }
}

public class Inhert {
    public static void main(String args[])
    {
        Sub s=new Sub();
      //Super s=new Super();
      s.disp();
    }
    
}
