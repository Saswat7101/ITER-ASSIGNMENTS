import java.util.Scanner;
public class A5Q14 {
	public static void main (String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a=0;
	int b=1;
	int i=2;
	System.out.println("Enter the range: ");
	int n=sc.nextInt();
	while(n>i)
	{
	System.out.println(a+"\n"+b);
	a=a+b;
	b=a+b;
	i+=2;
	}
	if(i%n==0)
	{
	System.out.println(a+"\n"+b);
	} else
	System.out.println(a);
	}
}
