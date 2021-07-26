package A2Q5;

public class Teacher extends Person {
	String sub,tassg;
	Teacher(String n,int a,String s,String t)
	{
		super(n,a);
		sub=s;
		tassg=t;
	}
	void show_data()
	{
		System.out.println(name+" "+age+" "+sub+" "+tassg);
	}
}
