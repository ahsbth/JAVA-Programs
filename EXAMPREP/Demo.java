package EXAMPREP;
import java.util.Scanner;
public class Demo {
    public static void main(String args[])
    {
      Main m=new Main();
      List l=m;
      l.get();
      m.find();
    }
}
interface List{
    void get();
}
class Data{
    int a;
    Scanner sc=new Scanner(System.in);
}
class Main extends Data implements List{
 public void get()
 {
  System.out.println("Enter the data=");
   a=sc.nextInt();
 }
 void find()
 {
    if(a%2==0)
    {
        System.out.println("Even");
    }
    else
    {
        System.out.println("Odd");
    }
 }
}


