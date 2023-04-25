public class SimpleandMultilevel{
    public static void main(String args[])
    {
         
        B b=new B();//for Simple Inheritence
        b.add();
        b.swap();
        C c=new C();//for Multilevel inhertence
        c.calculate();
    }
}
class A{

    int a=10;
    int b=15;
    void add()
    {
        System.out.println("Addition="+(a+b));
    }
}
class B extends A{
    int temp;
    void swap()
    {
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping first no="+a+"\tSecond no="+b);
    }
}
class C extends B{
    int c=20;
    void calculate()
    {
        System.out.println("Perimeter of traingle="+(a+b+c));
    }
}
