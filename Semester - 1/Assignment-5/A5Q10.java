import java.util.* ;
public class A5Q10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter x:");
		int x= s.nextInt() ;
		int i=3;
		double term=x, sum=0, error=0.000001 ;
		while(Math.abs(term)>error)
		{
			term= -1*term*(x*x)/((i-1)*i) ;
			sum+=term ;
			i+=2 ;
		}
		System.out.println("The sum is = "+sum);

	}

}
