public class ConstDemo{
    public static void main(String args[])
    {
       Initialize i=new Initialize();
       i.print_val();
    }
}
class Initialize{
    int a;
    public Initialize()
    {
        a=10;
    }
    void print_val()
    {
        System.out.println("Initialized value of Variable="+a);
    }
}