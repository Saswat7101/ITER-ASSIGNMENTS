import java.util.* ;
public class A5Q2 {

	public static void main(String[] args) {
		int n, m, ctr=0 ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of students:") ;
		n = s.nextInt() ;
		System.out.println("Enter marks of students:" );
		for(int i=0;i<n;i++)
		{
			m = s.nextInt() ;
			if(m>40)
			{
				ctr++ ;
			}
		}
		System.out.println("No. of students passed = "+ctr) ;

	}

}
