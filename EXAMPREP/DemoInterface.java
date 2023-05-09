package EXAMPREP;
import java.util.Scanner;
public class DemoInterface {
    public static void main(String[] args)
    {
        FindSimple f=new FindSimple();
        Interest i=f;
        i.simpleintrest();
    }
}
interface Interest{
      void simpleintrest();
}
class Field{
final int rate=25;
Scanner sc=new Scanner(System.in);
}
class FindSimple extends Field implements Interest{
    public void  simpleintrest()
    {
        System.out.println("Enter the Principle and Time=");
        float p=sc.nextFloat();
        float t=sc.nextFloat();
        float si=(p*rate*t/100);
        System.out.println("Simple Intreset="+si);
    }
}


