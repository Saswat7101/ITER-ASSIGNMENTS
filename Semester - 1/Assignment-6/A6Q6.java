
public class A6Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1 , cnt = 0;
		for (i =2 ;true ;i++ )
		{
			boolean palli = isPalindrome(i);
			if(palli==true)
			{
				boolean prime = isPrime(i);
				if(prime == true)
				{
					System.out.print(i+" ");
					cnt = cnt +1;
					if(cnt%10==0)
						System.out.println();
					
				}
			}
			if (cnt==100)
				break;
		}

	}
	public static boolean isPalindrome(int x)
	{
		int y=x,sum = 0;
		while(y>0)
		{
			sum = sum*10 +(y%10);
			y  = y/10; 
		}
		if(sum == x)
			return true;
		else 
			return false;
		
					
	}
	public static boolean isPrime(int j)
	{
		int i = 2 , flag = 0 ;
		for(i=2;i<=j/2;i++)
		{
			if(j%i==0)
			{
				flag =1;
				break;
			}
		}
			if (flag ==1)
				return false;
			else 
				return true;
		
/*	
	int c= 0;
	for(int n = 2;c<100;n++)
	{
		if(isPrime(n)==true && isPallindrome(n)==true)
		{
			System.out.print(n+" ");
			c++;
			if(c%10==0)
				System.out.println();
		}
	}
	
	
	
	}
	public static boolean isPrime(int x)
	{
		int i =3 , c = 0;
		for (i=3;i*i<=x;i++)
		{ 
			
		  if (x%i==0)
		  {
			c = 1;
			break;
		  }
		}
		if(c==1)
			return false;
		else 
			return true;
	}
		public static boolean isPallindrome(int x)
		{
			int y =x,i=0;
			while (y>0)
			{
				i=i*10 +y%10;
				y=y/10;
				
			}
			if(i==x)
				return true;
			else 
				return false;
*/
	}

}
