import java.util.* ;
public class A5Q1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter a number:") ;
		int i = s.nextInt() ;
		for(int j=0; j<=i; j++)
		{
			int k= (int)Math.pow(2, j) ;
			System.out.println(j+" "+k) ;
		}

	}

}
