import java.util.Scanner;
public class A2Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter x1 and y1:");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.println("Enter x2and y2:");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double s = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double di = Math.sqrt(s);
		System.out.println("The distance between the two points is "+di);
	}

}
