import java.util.* ;
public class A5q6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		int n ;
		double a, sn=0, H ;
		System.out.println("Enter n: ");
		n = s.nextInt() ;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a: ");
			a = s.nextDouble() ;
			sn+=1/a ;
		}
		H=n/sn ;
		System.out.println("The harmonic mean as per the entered data is = "+H);

	}

}
