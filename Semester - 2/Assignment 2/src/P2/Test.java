package P2;
import java.util.Scanner;
class Student {
	double mark1,mark2;
	void Input()
	{
		System.out.println("Enter the marks of the student");
		Scanner s1=new Scanner(System.in);
		mark1=s1.nextDouble();
		mark2=s1.nextDouble();
	}
	void Output()
	{
		System.out.println(" marks 2 subjects="+mark1+","+mark2);
}
}
public class Test extends Student
{
	 String name,roll;
	public  void input()
	 {
		 System.out.println("Enter the name and roll of the Student ");
		 Scanner s1=new Scanner(System.in);
		 name=s1.next();
		 roll=s1.next();
		 Input();
	 }
	public void output()
	 {
		 System.out.println("The details of the Student are:");
		 System.out.println("name="+name+" rollno="+roll);
		 Output();
	 }
	public double tot()
	{
		return mark1+mark2;
	}
}
