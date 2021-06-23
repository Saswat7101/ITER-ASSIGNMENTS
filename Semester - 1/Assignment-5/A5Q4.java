import java.util.* ;
public class A5Q4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		int n ;
		float  neg=0, pos=0, tot=0, avg, i=0 ;
		System.out.println("Enter an integer, the input ends if it is 0: ") ;
		
		  n=s.nextInt() ;
		  if (n==0)
			{System.out.println("No numbers are entered except 0") ;
			System.exit(0);
			}
		  if(n!=0)
		  while(n!=0)
		   {
			tot+=n ;
			i++ ;
			if(n<0)
			{ neg++ ;}
			if(n>0)
			{ pos++ ;}
			System.out.println("Enter an integer, the input ends if it is 0: ") ;
			
			  n=s.nextInt() ;
		   }
		  
		
	
		avg=tot/i ;
		System.out.println("The number of positive is "+(int)pos);
		System.out.println("The number of negative is "+(int)neg);
		System.out.println("The total is "+tot);
		System.out.println("The average is "+avg);

	}

}
