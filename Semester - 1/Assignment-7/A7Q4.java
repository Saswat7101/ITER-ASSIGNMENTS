import java.util.*;
public class A7Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the array of 10 integers ");
		double a [] = new double [10];
		for(int i = 0 ; i<10 ; i++)
		{
			a[i] = sc.nextDouble();
		}
		Minnumber(a);
	}
	public static void Minnumber(double b[])
	{
		double c = b[0];
		for(int i = 0 ; i < b.length ; i++)
		{
			if(c>b[i])
				c=b[i];
		}
		System.out.println("The minimum of the array is = "+c);
	}

}
