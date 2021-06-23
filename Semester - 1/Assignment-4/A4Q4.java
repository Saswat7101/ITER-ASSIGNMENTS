import java.util.*;
public class A4Q4 {
	public static void main(String[] args) {
		int cf,ct,cb,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count from");
		cf=sc.nextInt();
		System.out.println("Enter the count to");
		ct=sc.nextInt();
		System.out.println("Enter the count by");
		cb=sc.nextInt();
		for(i=cf;i<=ct;i+=cb)
		{
		System.out.print(i+" ");
		}
		}
}
