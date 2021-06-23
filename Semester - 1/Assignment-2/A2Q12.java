import java.util.Scanner;
public class A2Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount of eggs ");
		int egg=sc.nextInt();
		int gross=egg/144;
		egg=egg%144;
		int dozen=egg/12;
		int rem=egg%12;
		System.out.println("Your number of eggs is  "+gross+"  gross  , "+ dozen + "  dozen and  " +rem);
		sc.close();

	}

}
