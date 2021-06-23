import java.util.Scanner;
public class A2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value between 0 ot 1000");
		int x = sc.nextInt();
		int s = 0;
		
		int r = x%10;
		s = s+r;
		x = x/10;
		
		r = x%10;
		s = s+r;
		x = x/10;
		
		r = x%10;
		s = s+r;
		x = x/10;
		
		System.out.println("The sum of the digits is "+s);
	}

}
