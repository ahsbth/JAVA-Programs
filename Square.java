import java.util.Scanner;
public class Square{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Eneter  a no=");
      int no=sc.nextInt();
      if((no>10)&&(no<50))
      {
        System.out.println("Square of no="+(no*no));
      }
      else
      {
        System.out.println("Out of Range");
      }

    }
    
}
