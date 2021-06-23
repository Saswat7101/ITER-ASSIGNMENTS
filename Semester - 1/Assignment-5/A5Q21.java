import java.util.*;
public class A5Q21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		System.out.println("Enter the second number:");
		int y=sc.nextInt();
		while(y>0)
		{
		int rem=x%y;
		x=y;
		y=rem;
		}
		System.out.println("GCD = "+x);
		}
}
