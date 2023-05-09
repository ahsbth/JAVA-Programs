package EXAMPREP;

public class IntresetInterface {
    public static void main(String []args)
    {
        InterestCalculator ic=new InterestCalculator();
        //Interest i=ic;
       double si= ic.simpleintrest(2000,4);
       System.out.println(si);
        double ci=ic.compoundintreset(2000,4);
        System.out.println(ci);
    }
}
 interface Interest{
    double RATE=0.25;
   double simpleintrest(double p,double t);
   double compoundintreset(double p,double t);
}
class InterestCalculator implements Interest{
    public double simpleintrest(double p,double t)
    {
       return(p*RATE*t);
    }
    public  double compoundintreset(double p,double t)
    {
        return(p* Math.pow((1 + RATE), t) - p);
    }
}
