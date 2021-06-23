import java.util.Scanner;
public class A2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pounds:  ");
		double w=sc.nextDouble();
		System.out.print("Enter height in inches:   ");
		double i=sc.nextDouble();
		double kg=w*0.45359237;
		double mt=i*0.0254;
		double BMI=(kg/(mt*mt));
		System.out.println("BMI is   "+BMI);
		
		sc.close();
	}

}
