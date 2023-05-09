package THREAD;

public class ThreadDemo {
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
    }
}
class Thread1 extends Thread{
public void run()
{
    System.out.println("In Thread 1");
 for(int i=0;i<10;i++)
 {
    System.out.println("\t"+i);
 }
}
}
class Thread2 extends Thread{
   
    public void run()
    {
        System.out.println("In Thread 2");
        for(int i=0;i<10;i++)
        {
            System.out.println("\t"+i);
        }
    }
}