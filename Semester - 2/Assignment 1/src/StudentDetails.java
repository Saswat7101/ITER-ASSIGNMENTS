import java.util.Scanner;
 class student {
	String name;
	int regdno;
	int marks;
	void setData() {
		Scanner sc=new Scanner(System.in) ;
			System.out.println("enter name and regdno and marks");
			name=sc.next();
			regdno=sc.nextInt();
			marks=sc.nextInt();
		}
		void display() {
			System.out.println("NAME="+name+" \tRegdno="+regdno+" \tmarks="+marks);
		}
	}

	public class StudentDetails{
		public static void main(String args[]) {
			student s=new student();
			student s1=new student();
			s.setData();
			s.display();
			s1.setData();
			s1.display();
		}

}

