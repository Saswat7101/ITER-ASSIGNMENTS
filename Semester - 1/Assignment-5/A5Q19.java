import java.util.*;
public class A5Q19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		String str="";
		while(n>0)
		{
		int rem=n%2;
		str=rem+str;
		n=n/2;
		}
		System.out.println("The binary representation is = "+str);
		}
}
