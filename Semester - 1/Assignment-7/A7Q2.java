import java.util.*;
public class A7Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 200;
		int a[] = new int[max];
		int i = 0 ;
		for(i=0 ; ; i++)
		{
			System.out.println("Enter the integers between 1 to 100  and enter 0 to end the array inputing ");
			a[i]=sc.nextInt();
			if(a[i]==0)
				break;
			
		}
		displayFrequency(a,i);
		}
		public static void displayFrequency(int a[] , int n)
		{
			int b[] = new int [101];
			for(int i = 0 ;i<n ; i++)
			{
				if(a[i]!=0)
					b[a[i]]++;
			}
			for(int j = 0 ;j<b.length ; j++)
			{
				if(b[j]!=0)
				{
					if(b[j]==1)
					System.out.println(j+ " OCCURS "+b[j]+" TIME ");
					else 
						System.out.println(j+ " OCCURS "+b[j]+" TIMES ");
				}
					
			}
	}

}
