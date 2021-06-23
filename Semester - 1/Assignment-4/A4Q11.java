public class A4Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum1=0,sum2=0,diff=0,s=0;
		for(i=1;i<=10;i++)
		{
		sum1+=i*i;
		sum2+=i;
		}
		s=sum2*sum2;
		diff=s-sum1;
		System.out.println("The sum of squares of the integers="+sum1);
		System.out.println("The square of the sum of the integers="+s);
		System.out.println("The difference of sum1 and sum2 is= "+diff);
	}

}

