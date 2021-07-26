package A2Q4;
import java.util.Scanner;
public class CircleDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the centre of the circle and its radius");
		CircleType c=new CircleType();
		c.setradius();
		c.setpoint();
		System.out.println("The circumference of the circle="+c.circumference());
		System.out.println("The area of the circle="+c.area());
		
	}
}
