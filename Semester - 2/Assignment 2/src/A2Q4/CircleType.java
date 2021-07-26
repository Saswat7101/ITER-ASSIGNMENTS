package A2Q4;
import java.util.Scanner;
public class CircleType extends PointType {
	double radius;
	void setradius()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius of the given circle");
		radius=s1.nextDouble();
	}
	void showradius()
	{
		System.out.println("Radius of the circle="+radius);
	}
	double area()
	{
		return 3.14*radius*radius;
	}
	double circumference()
	{
		return 2*3.14*radius;
	}
}
