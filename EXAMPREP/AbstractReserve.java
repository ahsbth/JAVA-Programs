package EXAMPREP;
import java.util.Scanner;
public class AbstractReserve {
    public static void main(String[] args)
    {
       ReserveTrain rt=new ReserveTrain();
       rt.reserve();
       ReserveBus rb=new ReserveBus();
       rb.reserve();
    }
}
abstract class Reservation{
    abstract void reserve();
}
class ReserveTrain extends Reservation{
    String bdpt,arvpt;
    Scanner sc=new Scanner(System.in);
    public void reserve()
    {
    System.out.println("Enter the your Boarding Point and Arrival Point for Book Train tickext=");
     bdpt=sc.nextLine();
     arvpt=sc.nextLine();
     System.out.println("Successfully Booked");
    }
}
class ReserveBus extends Reservation{
    String bpt,arpt;
    Scanner sc=new Scanner(System.in);
    public void reserve()
    {
        System.out.println("Enter your Boarding point and arrival point for book Bus Ticket=");
        bpt=sc.nextLine();
        arpt=sc.nextLine();
        System.out.println("Successfully Booked");
    }
}
