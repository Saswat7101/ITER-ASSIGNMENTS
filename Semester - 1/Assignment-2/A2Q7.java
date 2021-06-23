import java.util.Scanner;
public class A2Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side:  ");
		double s = sc.nextDouble();
		double area = ((3*1.732050808*s*s)/2.0);
		System.out.println("The area of the hexagon is  "+area);
		sc.close();
	}

}
