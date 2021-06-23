import java.util.*;
public class A3Q5 {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in) ;
				double a, b ,c , d, r1, r2;
				System.out.println("Enter a, b, c") ;
				a=sc.nextDouble() ;
				b=sc.nextDouble() ;
				c=sc.nextDouble() ;
				d=(Math.pow(b, 2) - 4*a*c) ;
				if(d<0)			
				
					System.out.println("It has no real roots");
				
				else 						
				
					if(d==0)							
					{	
						System.out.println("It has one root") ;
						r1= (-b+(Math.pow(d,0.5)))/(2*a);		
						System.out.println("The root is"+r1) ;
					}
					if(d>0)				
					{	
						System.out.println("It has two real roots") ;			
						r1= (-b+(Math.pow(d,0.5)))/(2*a);
						r2= (-b-(Math.pow(d,0.5)))/(2*a);
						System.out.println("The roots are "+r1+" and "+r2) ; 
					}			
				
	}
}
