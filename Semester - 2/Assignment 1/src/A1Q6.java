import java.util.Scanner;

public class A1Q6 {
public static void largeSmall(int a[])
{
	int i=0;
	int max=a[i],min=a[i];
	for(;i<a.length;++i)
	{
		if(a[i]>max)
			max=a[i];
		if(a[i]<min)
			min=a[i];
	}
	System.out.println("The largest element is="+max);
	System.out.println("The smallest element is="+min);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter the numbers in the array");
		for(int i=0;i<=9;++i)
		{
			a[i]=s1.nextInt();
		}
		largeSmall(a);
		int max=a[0],min=a[0];
		System.out.println("Now comparing with max and min funtions");
		for(int i=1;i<10;++i)
		{
			max=(int)Math.max(max,a[i]);
			min=(int)Math.min(min,a[i]);
		}
		System.out.println("the largest and smallest value using the max and min="+max+" ,"+min+" respectively");
		

	}

}