
import java.util.* ;
public class A5Q7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		int n, sum=0, a=1 ;
		System.out.println("Enter no. of terms: ");
		n=s.nextInt() ;
		for (double i=2;i<n+2;i++)
		{
			double j = Math.pow(-1, i) ;
			sum=sum+(int)j*a ;
			a+=2 ;	
		}
		System.out.println("The computed value is = "+sum);

	}

}
