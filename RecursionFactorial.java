import java.util.Scanner;
 public class RecursionFactorial {
	static int factorial(int n)
	{
		if (n == 0 || n == 1)
			return 1;
		return n * factorial(n - 1);
	}
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no for find factrial=");
        int no=sc.nextInt();
		int ans = factorial(no);
		System.out.println("Factorial of " +no+"="+ans);
	}
}
