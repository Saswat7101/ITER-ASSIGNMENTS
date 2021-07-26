import java.util.Scanner;
public class A1Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		char w[]= {'c','a','r','b','o','n'};
		int c=0;
		for(int i=0;i<w.length;i++)
		{
			for(int j=0;j<w.length;j++)
			{
				for(int k=0;k<w.length;k++)
				{
					for(int l=0;l<w.length;l++)
					{
						for(int m=0;m<w.length;m++)
						{
							for(int n=0;n<w.length;n++)
							{
								if(i!=j && i!=k && i!=l && i!=m && i!=n && j!=k && j!=l && j!=m && j!=n && k!=l && k!=m && k!=n
										&& l!=m && l!=n && m!=n )
								{
									System.out.println(w[i]+""+w[j]+""+w[k]+""+w[l]+""+w[m]+""+w[n]);
									c++;
								}
							}
					}
					}
				}
			}
		}
		
		System.out.println(c);
	
	}
}
