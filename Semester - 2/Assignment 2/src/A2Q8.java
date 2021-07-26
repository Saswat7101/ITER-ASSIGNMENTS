import java.util.Scanner;
interface EmpInterface
{
	void displayEmp();
	void giveBonus(double amount);
}
abstract class Employee implements EmpInterface
{
	String empid,fname,lname;
	double sal;
	
}
class Manager extends Employee
{
	Manager(String emp,String nf,String nl,double s)
	{
		empid=emp;
		fname=nf;
		lname=nl;
		sal=s;
	}
	public void displayEmp()
	{
		System.out.println("The name of the employee="+fname+" "+lname);
		System.out.println("EMPID="+empid);
		System.out.println("Salaray="+sal);
	}
	public void giveBonus(double amt)
	{
		System.out.println("Bonus added");sal=sal+amt;
	}
	
}
public class A2Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m ;Scanner ss1=new Scanner(System.in);
		System.out.println("Enter the details of the employee");
		System.out.println("Enter the first name and last name ,empid, salary");
		String fname=ss1.next();
		String lname=ss1.next();
		String emp=ss1.next();
		double sal=ss1.nextDouble();
		m=new Manager(emp,fname,lname,sal);
		while(true) 
		{
		System.out.print("Enter the bonus amount=");
		sal=ss1.nextDouble();
		if(sal<0)
		{
			System.out.println("Invalid bonus...please input a correct bonus amount");
		}
		else
		{
			m.giveBonus(sal);break;
		}
		
	    }
	    m.displayEmp();
		

	}

}

