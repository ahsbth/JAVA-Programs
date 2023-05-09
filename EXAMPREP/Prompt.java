package EXAMPREP;
import java.util.Scanner;
public class Prompt {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your Name=");
      String name=sc.nextLine();
         if(name.equals("Ahsan"))
         {
            System.out.println("Welcome "+name);
         }
         else{
            System.out.println("Incorrect Answer .Please Try Again=");
            name=sc.nextLine();
            if(name.equals("Ahsan"))
            {
            System.out.println("Ok");
            }
            else{
                System.out.println("Sorry");
            }
         }
    }
}
