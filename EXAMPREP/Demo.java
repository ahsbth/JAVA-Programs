package EXAMPREP;
import java.util.Scanner;
public class Demo {
    public static void main(String args[])
    {
      Main m=new Main();
      Interest l=m;
      l.simpleintrest();
      //m.find();
    }
}
interface Interest{
    void simpleintrest();
    void compoundintreset();
}
class Data{
   final int r=25;
    Scanner sc=new Scanner(System.in);
}
class Main extends Data implements Interest{
 public void simpleintrest()
 {
  System.out.println("Enter the principle and time=");
  float p=sc.nextFloat();
  float t=sc.nextFloat();
 float si=(p*r*t)/100;
 System.out.println("Simpleintereset="+si);
}

}



