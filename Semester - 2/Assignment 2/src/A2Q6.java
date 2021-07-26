import java.util.Scanner;
abstract class Shape
{
	
	public abstract void area();
}
class Square extends Shape
{
	double a;
	Square()
	{
		super();
		System.out.println("Enter the side of the square");
		Scanner s=new Scanner(System.in);
		a=s.nextDouble();
				
	}
	public void area()
	{System.out.println("The area of the Square = "+ a*a);}
}
class Triangle extends Shape
{
	double a,b;
	Triangle()
	{
		super();
		System.out.println("Enter the base and the side of the triangle");
		Scanner s=new Scanner(System.in);
		a=s.nextDouble();
		b=s.nextDouble();
				
	}
	public void area()
	{System.out.println("The area of the Triangle = "+ 0.5*a*b);}
}
class Circle extends Shape
{
	double a;
	Circle()
	{
		super();
		System.out.println("Enter the radius of the Circle");
		Scanner s=new Scanner(System.in);
		a=s.nextDouble();
		
				
	}
	public void area()
	{System.out.println("The area of the Circle= "+ 3.14*a*a);}
}

public class A2Q6
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		Circle c=new Circle();
		Square s=new Square();
		Triangle t=new Triangle();
		//Shape ss=new Square();//this thing works
		c.area();
		s.area();
		//ss.area();
		t.area();
		
		
	}

}

