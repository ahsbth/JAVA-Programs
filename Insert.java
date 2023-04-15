import java.util.Scanner;
public class Insert {
    public static void main(String args[])
    {   
        int a[]=new int[100];
        int i,n,ele,pos;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range for array=");
        n=sc.nextInt();
        System.out.println("Enter  elements of array="+n);
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Before Insertion");
        for(i=0;i<n;i++)
        {
            System.out.print("\t"+a[i]);
        }
        System.out.println("\nEnter position and element for insert in array=");
        pos=sc.nextInt();
        ele=sc.nextInt();
        for(i=n+1;i>=pos;i--)
        {
            a[i]=a[i-1];
        }
        a[pos]=ele;
        System.out.println("After Insertion");
        for(i=0;i<n;i++)
        {
            System.out.print("\t"+a[i]);
        }
    }
}
