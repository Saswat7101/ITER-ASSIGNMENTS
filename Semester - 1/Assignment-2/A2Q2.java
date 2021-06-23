import java.util.Scanner;
public class A2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and radius of the cylinder");
		double r = sc.nextDouble();
		double l = sc.nextDouble();
		
		double a = r*r*Math.PI;
		System.out.println("The area is "+a);
		
		double v = a*l;
		System.out.println("The volume is "+v);
	}

}
