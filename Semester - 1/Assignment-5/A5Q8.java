
import java.util.* ;
public class A5Q8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		int n, i, fact=1;
		System.out.println("Enter n: ");
		n=s.nextInt() ;
		for(i=1;i<=n;i++)
		{
			fact*=i ;
		}
		System.out.println("The factorial of "+n+" is "+fact);

	}

}
