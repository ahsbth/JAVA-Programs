import java.util.Scanner;
public class Add {
    public static void main(String args[])
    {   
        int ea=0,oa=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The range of no=");
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                ea+=i;
            }
            else
            {
                oa+=i;
            }
        }
         System.out.println("Addition of Even no=\t"+ea);
         System.out.println("Addition of odd no=\t"+oa);



    }
    
}
