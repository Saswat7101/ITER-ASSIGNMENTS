import java.util.Scanner;
public class A1Q2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number greater than 2");
	    int a = sc.nextInt();
	    int c = 0 ;
	   	    for(int i=a;i>0;i=i/2)
		{
				
		if(i<2)
		{
			System.out.println(a+" has repeated itself "+ c +" times");
		}
		else {
			
			c++;
		}
	    	
	}

}
}
