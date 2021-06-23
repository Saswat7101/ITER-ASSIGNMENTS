import java.util.*;
public class A7Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number to convert to octal  ");
		int  n = sc.nextInt();
		DeciToOctal(n);

	}
	public static void DeciToOctal(int n )
	{
		int a[] = new int [100];
		int i = 0;
		while (n >0)
		{
			int r = n %8;
			a[i] = r ;
			n = n/8;
			i++;
		}
		for(int j = i-1 ; j>= 0; j--)
		{
			System.out.print(a[j]);

		}
		System.out.println("\n");
	}

}
