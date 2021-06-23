import java.util.Scanner;
public class A2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values v0 v1 and t: ");
		double v0 = sc.nextDouble();
		double v1 = sc.nextDouble();
		double t = sc.nextDouble();
		
		double a = (v1-v0)/t;
		System.out.println("The average acceleration is "+a);
	}

}
