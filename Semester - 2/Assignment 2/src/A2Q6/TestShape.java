package A2Q6;
import java.util.Scanner;
public class TestShape {
	public static void main(String[] args) {
		Square s=new Square(8);
		s.area();
		s.show();
		Triangle t=new Triangle(9,8);
		t.area();
		t.show();
		Circle c=new Circle(8.0);
		c.area();
		c.show();
		
		

	}
}
