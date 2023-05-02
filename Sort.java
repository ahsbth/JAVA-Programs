import java.util.Scanner;
public class Sort{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array=");
        int sz=sc.nextInt();
        int a[]=new int[sz],i;
        System.out.println("Enter the elemnts=");
        for(i=0;i<sz;i++){
          a[i]=sc.nextInt();
        }
         Array ar=new Array();
         ar.disp(a);
        // System.out.println("1 Dispaly");
        // System.out.println("2 for Bubble Sort");
        // System.out.println("3 for Selection Sort");
        // System.out.println("4 for Insertion Sort");
        // System.out.println("Enter your choice=");
        // int ch=sc.nextInt();
        // switch(ch)
        // {
        //     case 1:
        // }
    }
}
class Array{
    int i,j,temp;;
    void disp(int [] a)
    {   System.out.println("Arrray are");
        for(i=0;i<a.length;i++)
        {
            System.out.println("\t"+a[i]);
        }
    }
    void bubble(int [] a){
        for(i=0;i<a.length;i++){
            for(j=1;j<a.length;j++){
                if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
               
            }
        }
    }
    void selection(int [] a){
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
