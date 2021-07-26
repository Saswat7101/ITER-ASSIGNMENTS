import java.util.Scanner;
public class A1Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter three numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    
		if ((a+b)==c) 
		{
		System.out.println("Correct arithimic formula");
		}
		else if (a==(b-c))
		{	
			System.out.println("Correct arithimic formula");
		}
		else if ((a*b)==c)
		{
			System.out.println("Correct arithimic formula");
		}
		else if(a+b==c&&b-c==a&&a*b==c)
		{
			System.out.println("all are correct");
		}
		else
		{
			System.out.println("nothing are correct");
		}
	}
}
