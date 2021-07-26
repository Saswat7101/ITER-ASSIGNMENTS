import java.util.Scanner;
public class StudentDemo {

	public static void main(String[] args) {
	
	exam e[]=new exam[5];
	
	for(int i=0;i<5;i++)
	{
		e[i]=new exam();
	}
	for(int i=0;i<5;i++) {
		
		e[i].input_student();
		e[i].input_mrks();
	}
	for(int i=0;i<5;i++) {
		
		e[i].display_student();
		e[i].display_result();
	}

	}

}
class student
{
	int rollno;
	String name;
	String course;
	Scanner sc=new Scanner(System.in);
	void input_student() {
		System.out.println("enter roll number of the student");
		rollno=sc.nextInt();
		System.out.println("enter name of the student");
		name=sc.next();
		System.out.println("enter course ");
		course=sc.next();
		}
	void display_student()
	{
		System.out.println("roll number of student"+rollno);
		System.out.println("name="+name);
		System.out.println("course="+course);
	}
}
class exam extends student
{
	double mark1,mark2,mark3;
	
	void input_mrks() {
		
		System.out.println("enter marks of subject1");
		mark1=sc.nextDouble();
		System.out.println("Eenter of mark of subject2");
		mark2=sc.nextDouble();
		System.out.println("enter mark of subject3");
		mark3=sc.nextDouble();
		
	}
	void display_result() {
		
		System.out.println("result="+(mark1+mark2+mark3));
	}
}
