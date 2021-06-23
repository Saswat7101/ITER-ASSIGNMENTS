import java.util.*;
public class A3Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		
		double a, b, c, d, e, f, x, y ;
				
		System.out.println("Enter a, b, c, d, e and f: ") ;
				
		a=sc.nextDouble() ;
				
		b=sc.nextDouble() ;
				
		c=sc.nextDouble() ;
				
		d=sc.nextDouble() ;
				
		e=sc.nextDouble() ;
				
		f=sc.nextDouble() ;
				
				
		x=(((e*d)-(b*f))/((a*d)-(b*c))) ;
				
		y=(((a*f)-(e*c))/((a*d)-(b*c))) ;
				
				
		if(((a*d)-(b*c))==0)
					
		System.out.println("The equation has no solution.") ;
				
		else
					
		System.out.println("x is "+x+" and y is "+y) ;

			
	}

}
