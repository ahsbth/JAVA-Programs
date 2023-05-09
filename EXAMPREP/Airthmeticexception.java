package EXAMPREP;
import java.util.Scanner;
public class Airthmeticexception{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a,b;
        try{
            System.out.println("Enter two nos=");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Addition="+(a+b));
            System.out.println("Substraction="+(a-b));
            System.out.println("Devision="+(a/b));
            
          }
          catch(ArithmeticException e)
          {
           //System.out.println("Devide / zero"); 
           System.out.println("Multiplication="+(a*b));
           
          }
        sc.close();
        }
    }
      
    

