import java.util.Scanner;
public class DynamicArray {
    public static void main(String args[])
    {
        int sz,i;
        int A[]=new int[sz];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array=");
        sz=sc.nextInt();
        System.out.println("Enter the value for array=");
        for(i=0;i<sz;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Array Elements Are=");
        for(i=0;i<sz;i++)
        {
            System.out.print("\t"+A[i]);
        }

    }

    
}
