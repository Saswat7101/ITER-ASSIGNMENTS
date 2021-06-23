import java.util.Scanner;
public class A2Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        System.out.print("Enter investment amount:  ");
        double investmentAmount=sc.nextDouble();
        System.out.print("Enter annual interest rate in percentage:  ");
        double annualinterestrate = sc.nextDouble();
        System.out.print("Enter number of years:   ");
        double numberOfYears=sc.nextDouble();
        double monthlyinterestrate= annualinterestrate/1200;
        double futureInvestmentValue = investmentAmount*(Math.pow(1 +monthlyinterestrate,numberOfYears*12));
        System.out.println("Accumulated value is $   "+ futureInvestmentValue);
	}

}
