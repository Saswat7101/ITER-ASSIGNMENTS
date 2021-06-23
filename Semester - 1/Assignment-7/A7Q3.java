import java.util.*;

public class A7Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int  b [] = inputArray();
				
		System.out.println("Enter the integer to be searched ");
				
		int m = sc.nextInt();
				
		searchInteger(b,m);

			
		}
			
		public static int[] inputArray()
			
		{
				
		Scanner sc = new Scanner(System.in);
				
		int a[] = new int[10];
				
		System.out.println("Enter the array with 10 integers ");
				
		for(int i = 0 ;i< a.length ; i++)
				
		{
					
		a[i] = sc . nextInt();
				
		}
				
		return a;
			
		}
			
		public static void searchInteger(int a[] , int b)
			
		{
				
		int c = 0 ;
				
		for(int i = 0 ;i<a.length ; i++ )
				
		{
					
		if(a[i]==b)
						
		c=c+1;
				
		}
				
		if(c==0)
					
		System.out.println("The number is not present in the arary ");
				
		else 
					
		System.out.println("The number is present and the number of times is = "+c);

	}

}
