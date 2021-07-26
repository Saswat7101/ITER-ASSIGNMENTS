public class A1Q7B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x[]= {2,3,5,8,7};
    int n=5;
    findDistinctProduct(x,n);
	}

	public static void findDistinctProduct(int[] x,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(x[i]!=x[j])
				{
					if((x[i]*x[j])%2!=0)
                      {
	                    System.out.println(x[i]+" "+x[j]);
                      }
				}
			}
		}
	}
	}
