import java.util.*;
public class A7Q8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max =10;
		int a[] = new int [max];
		System.out.println("Input number of elements in an array less than 10 ");
		int n = sc.nextInt();
		System.out.println("Input array elements ");
		for(int i = 0 ;i< n ;i++)
		a[i] =sc.nextInt();
		while(true)		
		{
		System.out.println("\n0:Exit");
		System.out.println("1: Display");
		System.out.println("2: Insert");
		System.out.println("3:Delete");
		System.out.println("Enter your choise ");
		int loc = 0;
		int ch = sc.nextInt();
		switch(ch)			
		{
		case 0 : System.out.println("The program ends here");	
		System.exit(0);			
		break;
		case 1 : System.out.println("The array is ");		
		display(a);			
		break;
		case 2:  System.out.println("Enter the element to be inserted ");
		int ele = sc.nextInt();
		System.out.println("Enter the location of the element to be inserted ");
		loc = sc.nextInt();
		Insert(a , n ,ele,loc );				
		n++;			
		break;
		case 3 :System.out.println("Enter the location of element to be deleted "); 
		loc = sc.nextInt();		 
		delet(a,n,loc);				 
		n--;
		break;
		default :System.out.println("Invalid choise please try again ");			
		break;			
		}		
		}	
		}
		public static void Insert(int a[] , int n , int ele , int loc )
			{
		for(int i =n-1 ; i>=loc ;i--)		
		{
		a[i+1]=a[i];		
		}
		a[loc] = ele;
		display(a);	
		}
		public static void delet(int a[] , int n ,int loc )	
		{
		for(int i = loc+1;i<n ;i++)		
		{
		a[i-1] = a[i];		
		}
		a[n-1] =0;
		display(a);			
		}			
		public static void display(int a[])
			{				
		for(int j=0 ;j< a.length ;j++)
		System.out.print(a[j]+" ");
	}
}
