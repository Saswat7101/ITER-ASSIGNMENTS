import java.util.Scanner;
public class A6Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the integer ");
		int x = sc.nextInt();
		int y = reverse(x);
		System.out.println("IT'S REVERSE IS = "+y);
		boolean  paali = isPalindrome(x,y);
		if (paali == true)
		System.out.println("IT'S A PALLINDROME");
		else 
			System.out.println("NO, SORRY  NOT A PALLINDROME");
		}
		public static int reverse(int x)
		{
			int y = x , sum = 0 ;
			while (y>0)
			{
				sum = sum*10 + (y%10);
				y = y/10;
			}
			return (sum);
		}
		public static boolean isPalindrome(int x,int y)
		{
			if (x==y)
				return true;
			else 
				return false;
	}

}
