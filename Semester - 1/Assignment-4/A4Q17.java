import java.util.Scanner;
public class A4Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n;j++)
		{
		if((i%j==0)||(j%i==0))
		System.out.print("* ");
		else
		System.out.print(" ");
		}
		System.out.println(i);
		}
	}

}
