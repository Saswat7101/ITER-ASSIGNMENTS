import java.util.Scanner;
public class A2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for feet:");
		double f = sc.nextDouble();
		
		double m = f*0.305;
		System.out.println(f+" feet is "+m +" meters");
	}

}
