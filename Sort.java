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
        for(;;){
          
            System.out.println("\n1 for Dispaly");
            System.out.println("2 for Bubble Sort");
            System.out.println("3 for Selection Sort");
            System.out.println("4 for Exit from Program");
            System.out.println("Enter your choice=");
            int ch=sc.nextInt();
            switch(ch)
            {   
                
                case 1:ar.disp(a);
                       break;
                case 2:ar.bubble(a);
                      break;
                case 3:ar.selection(a);
                       break;
                case 4:System.exit(0);
                default:System.out.println("invalid choice");
            }
        }
        
    }
}
class Array{
    int i,j,temp;;
    void disp(int[] a)
    {   System.out.println("Arrray are");
        for(i=0;i<a.length;i++)
        {
            System.out.print("\t"+a[i]);
        }
    }
    void bubble(int[] a){
        for(i=0;i<a.length-1;i++){
            for(j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
               
            }
        }
    }
    void selection(int[] a){
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
