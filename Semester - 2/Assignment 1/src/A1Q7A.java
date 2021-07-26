import java.util.Scanner;
public class A1Q7A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the elements in the array");
		int a[]=new int[10];int flag=0;
		int i=0;
		for (i=0;i<10;++i)
		{
			a[i]=s1.nextInt();
		}
		for(i=0;i<10 && flag!=1;++i)
		{
			for(int j=0;j<10;++j)
			{
				if(i!=j && (a[i]*a[j])%2!=0 )
				{
					flag=1;break;
				}
			}
		}
		if(flag==1)
		System.out.println("Yes there is a pair");
		else
			System.out.println("no there is no pair");

	}

}

