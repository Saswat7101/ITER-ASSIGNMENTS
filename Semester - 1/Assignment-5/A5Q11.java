import java.util.*;
public class A5Q11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x in radians:");
		double x=sc.nextDouble();
		double error=0.000001;
		double tcos=1;
		double term=1;
		int i=0;
		while(Math.abs(term)>error)
		{
		i+=2;
		term=-term*(x*x)/(i*(i-1));
		tcos+=term;
		}
		System.out.println("cos("+x+") = "+tcos);
		}
}
