public class StrDemo {
    public static void main(String args[]){
        String a="Ram";
        String b=new String(a);
        String c=new String(a);
        String d="Ram";
        System.out.println(b==a);
        System.out.println(a==d);
    }
}
