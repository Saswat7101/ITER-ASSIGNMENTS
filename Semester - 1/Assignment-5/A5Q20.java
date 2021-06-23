import java.util.Scanner;
public class A5Q20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);		
		System.out.println("Enter a no.: ");		
		int n= sc.nextInt();		
		int i=2;		
		while(i<=n && n>0)		
		{			
		if(n%i==0)			
		{	
		System.out.print(i+",");				
		n/=i;
		}		
		else				
		i++;	
		}
		}
}
