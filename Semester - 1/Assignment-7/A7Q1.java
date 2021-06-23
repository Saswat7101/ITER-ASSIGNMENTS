import java.util.Scanner;
public class A7Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number of elements in the array ");
		int n = sc.nextInt();
		double sum =0.0, avg=0.0;
		double a[] = new double [n];
		for(int i = 0 ; i<a.length ; i++)
		{
			 a[i] = Math.random();
			 sum = sum + a[i];
		}
		avg = sum/n;
		System.out.println("The sum is = "+sum);
		System.out.println("The average value is = "+avg);
	}

}
