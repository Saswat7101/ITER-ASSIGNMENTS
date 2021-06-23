import java.util.Scanner;
public class a2q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a degree in celsius:");
		double celsius = sc.nextDouble();
		double farenheit = (9.0 / 5) * celsius + 32;
		System.out.println(celsius + " celsius is  "+ farenheit + "  farenheit");
	}

}
