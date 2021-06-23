import java.util.Scanner;
public class A5Q15 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter an Amount : ");
		double amt = sc.nextDouble();
		System.out.print("Enter annual intrest rate : ");
		double ir = sc.nextDouble();
		System.out.print("Enter time in months : ");
		int t = sc.nextInt();
		double sum=0;
		ir/=1200;
		for(int i=1;i<=t;i++)
			sum=(amt+sum)*(1+ir);
		System.out.println("Your total saving is "+sum);

	}
}
