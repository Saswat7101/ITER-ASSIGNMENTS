import java.util.*;
public class A7Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter ten numbers : ");
		int a[] = new int [10];
		for(int i = 0 ;i < a.length ; i++)
			a[i] = sc.nextInt();
		int b[] = eliminateDuplicates(a);
		for(int j = 0 ; j<a.length ; j++)
			System.out.print(b[j]+" ");
	}
	public static int[] eliminateDuplicates(int a[])
	{
		int b[] = new int [a.length];
		int k = -1 ;
		int j;
		for(int i = 0 ; i<a.length ; i++)
		{
			for( j = k ; j>=0 ; j--)
			{
				if(a[i]==b[j])
					continue;
			{
			if(j==-1)
			{
				k++;
				b[k]= a[i];
			}
		}
	}
		
	}
	return b;
	}
}
