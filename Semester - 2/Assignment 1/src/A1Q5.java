import java.util.Scanner;
public class A1Q5 {
	public static int isOdd(int number) {
		// TODO Auto-generated method stub
		while(number!=1&&number!=0) {
			number=number-2;
		}
		return number;
    
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int o=isOdd(n);
		if(o==1) {
			System.out.println("odd");	
		}
		else
			System.out.println("even");
	}
}
