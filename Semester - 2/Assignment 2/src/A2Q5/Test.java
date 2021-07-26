package A2Q5;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1 if the person is a student and any other if a teacher");
		int ch=s1.nextInt();
		if (ch==1)
		{
			System.out.println("Enter the course,roll,name,age and marks of the student");
			Scanner s2=new Scanner(System.in);
			String n,c,r;
			int a;double m;
			n=s2.next();
			c=s2.next();
			r=s2.next();
			a=s1.nextInt();
			m=s1.nextDouble();
			Student s=new Student(r,c,n,a,m);
			s.show_data();
		}
		else
		{
			Scanner s2=new Scanner(System.in);
			String su,n,tas;
			int a;
			System.out.println("subject, name,time assigned,age");
			su=s2.next();
			n=s2.next();
			tas=s2.next();
			a=s1.nextInt();
			Teacher t=new Teacher(n,a,su,tas);
			t.show_data();
		}

	}
}
