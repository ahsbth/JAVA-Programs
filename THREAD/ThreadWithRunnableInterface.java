package THREAD;

public class ThreadWithRunnableInterface {
    public static void main(String args[])
    {   
      Thread t1=new Thread(new A());
      t1.start();
      Thread t2=new Thread(new B());
      t2.start();
    }
}
class A implements Runnable{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("\t"+i);
        }
    }
}
class B implements Runnable{
    public void run()
    {
        for(int j=0;j<5;j++)
        {
            System.out.println("\t"+j);
        }
    }
}