import java.util.*;
public class A3Q9 
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number whose reverse to be done ");
		int n = sc.nextInt();
		System.out.print("The number after being reversed is= ");
		reverse(n);
	}
	public static void reverse(int x )
	{
		
		if(x==0)
			return ;
		else 
		{
			 System.out.print(x%10);
			 reverse(x/10);
		}
	}
}

