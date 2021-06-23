import java.util.Scanner;
public class A2Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of minutes:  ");
		int d=sc.nextInt();
		int mul=60*24*365;
		int y=d/mul;
		int da=d%mul;
		int day=da/(60*24);
		System.out.println(d+"  minutes is approximately  "+y+"  years and  "+day+" days  " );
	}

}
