package EXAMPREP;

public class MainRBI {
    public static void main(String args[])
    {
       RBI rbi=new RBI();
        SBI sbi=new SBI();
        AXISS axiss=new AXISS();
        HDFC hdfc=new HDFC();
        ICICI icici=new ICICI();
        rbi.getInterestRate();
        sbi.getInterestRate();
        hdfc.getInterestRate();
       axiss.getInterestRate();
       icici.getInterestRate();
    }
}
class RBI{
   public void getInterestRate()
   {
    System.out.println("Intreset Rate of RBI is 4%");
   }
}
class SBI extends RBI{
    public void getInterestRate()
   {
    System.out.println("Intreset Rate of SBI is 3.7%");
   }
   
}
class AXISS extends RBI{
    public void getInterestRate()
   {
    System.out.println("Intreset Rate of AXISS is 6.29%");
   }
}
class HDFC extends RBI{
    public void getInterestRate()
    {
     System.out.println("Intreset Rate of HDFC is 7.8%");
    }
}
class ICICI extends RBI{
    public void getInterestRate()
   {
    System.out.println("Intreset Rate of ICICI is 6.8%");
   }
}
