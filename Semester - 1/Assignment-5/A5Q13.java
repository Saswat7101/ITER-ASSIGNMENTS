import java.util.*;
public class A5Q13 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n, t1 = 0, t2 = 1;
	System.out.println("Enter number of terms: ");
	n=sc.nextInt();
	System.out.println("Fibonacci series:-");
	for (int i = 1; i <= n; ++i)
	{
	System.out.print(t1 + " ");
	int sum = t1 + t2;
	t1 = t2;
	t2 = sum;
	}
  }
}
