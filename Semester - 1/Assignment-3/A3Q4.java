import java.util.* ;
public class A3Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		
		char a ;
				
		System.out.println("Enter any character") ;
				
		a = sc.nextLine().charAt(0) ;
				
		if((int)a>=65 && (int)a<=90)
					
		{
		System.out.println("It is an upper case letter") ;

		}		
		else if((int)a>=97 && (int)a<=122)
					
		{
		System.out.println("It is a lower case letter") ; 
		}
				
		else if ((int)a>=48 && (int)a<=57)
					
		{
		System.out.println("It is a number") ;
		}		
		else 
		{
		System.out.println("It is a special character");
		}


}

}
