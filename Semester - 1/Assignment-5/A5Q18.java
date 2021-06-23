import java.util.*;
public class A5Q18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the given root:");
		int n=sc.nextInt();
		int k=Integer.parseInt(args[0]);
		double g1,g2;
		g2=n/2;
		do
		{
		g1=g2;
		g2=((k-1)*g1+n/Math.pow(g1,k-1))/k;
		}while(Math.abs(g1-g2)>0.000001);
		System.out.println("The square root of "+n+" is = "+g2);
		}
}
