
public class A5Q23 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int flag;
		for(int i=2;i<=n;i++)
		{
		flag=0;
		for(int j=2;j<=i;j++)
		{
		if(i%j==0)
		flag++;
		}
		if(flag==1)
		System.out.println(i+" is prime");
		else
		System.out.println(i+" is not prime");
		}
		}
}
