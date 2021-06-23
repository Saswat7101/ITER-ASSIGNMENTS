
public class A6Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2000 , sum = 0;
		for(i=2000;i<=2020;i++)
		{
			int n = numberOfDaysInAYear( i);
			System.out.println("The total number of days in year "+i+" = "+ n);
		}
		
	}
	public static int numberOfDaysInAYear(int x)
	{
		if (x%100==0&&x%400==0)
			return 366;
		else if (x%100!=0&&x%4==0)
			return 366;
		else
			return 365;
	}

}
