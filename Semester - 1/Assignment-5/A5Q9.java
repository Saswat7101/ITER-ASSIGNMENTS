import java.util.* ;
public class A5Q9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		int f=1;
		double x, n, a ;
		
		System.out.println("Enter x and n:");
		x=s.nextDouble() ;
		n=s.nextDouble() ;
		for (int i=1; i<=n;i++)
		{
			f*=i ;
		}
		a=Math.pow(x, n)/f ;
		System.out.println("The computed value is "+a);

	}

}
