package A2Q5;

public class Student extends Person {
	String roll,course;double marks;
	Student(String r,String b,String n,int a,double m)
	{   super(n,a);
		course=b;
		roll=r;
		marks=m;
	}
	void show_data()
	{
		System.out.println(course+" "+roll+" "+name+" "+age+" "+marks);
	}
}
