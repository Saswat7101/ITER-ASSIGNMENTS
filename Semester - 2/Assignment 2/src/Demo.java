import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sale");
	double s=sc.nextDouble();
	
       if(s<0)
    	   System.out.println("invalid input"); 
       else {
    	   commission ob=new commission(s);
    	   double com=ob.getcommission();
    	   System.out.println("commission ="+com);
    	   }
	}

}
class commission{
	double sales;
	commission(double sales){
		this.sales=sales;
	}
	double getcommission() {
		double r;
		if(sales<500)
		{
			r=(2*sales)/100;
		}
		else
			if(sales>500&&sales<5000)
			{
				r=(5*sales)/100;
			}
			else
				r=(8*sales)/100;
		return r;
	}
}
