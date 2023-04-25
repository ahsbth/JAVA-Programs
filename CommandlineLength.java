public class CommandlineLength{
    public static void main(String args[])
    {    
        int len=args.length;
        for(int i=0;i<=len;i++)
        {
         System.out.println(Integer.parseInt(args[i]));
        }
    }
}