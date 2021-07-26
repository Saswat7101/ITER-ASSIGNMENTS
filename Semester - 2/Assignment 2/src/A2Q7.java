import java.util.Scanner;

 interface inter
{
	public  void display();
	public  int count();
}
class name_ implements inter
{    
	static int maxcount=0;
String name;
	name_(){super();}
	public int count()
	{
		return name.length();
	}
	
		public void display()
		{
			System.out.println(maxc());
		}
	
	int maxc()
	{
		if(count()>maxcount) {maxcount=count();}
		return maxcount;
	}
	
	
}
public class A2Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner (System.in);
		name_ n=new name_();
		System.out.println("enter the name:");
		n.name=s1.next();
		n.display();
		
	}

}

