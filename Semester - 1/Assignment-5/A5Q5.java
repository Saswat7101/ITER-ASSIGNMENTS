import java.util.* ;
public class A5Q5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		int n, sum=0,  i=0 ;
		float avg ;
		System.out.print("Enter no. of numbers: ") ;
		n=s.nextInt() ;
		System.out.println("Enter numbers:-") ;
		for(int j=0;j<n;j++)
		{
			int k=s.nextInt() ;
			sum+=k ;
		}
		avg=sum/n ;
		System.out.println("The sum is = "+sum);
		System.out.println("The average is = "+avg);
		

	}

}
