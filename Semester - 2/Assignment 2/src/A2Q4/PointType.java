package A2Q4;
import java.util.Scanner;
public class PointType {
	double x,y;
	void setpoint()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the coordinates:");
		x=s1.nextDouble();
		y=s1.nextDouble();
	}
	double getx()
	{
		return x;
	}
	double gety()
	{
		return y;
	}
}
