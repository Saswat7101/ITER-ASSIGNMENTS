package A2Q6;

public class Circle extends Shape{
	double r,ar2;
	  Circle (double r){
		  this.r=r;
	  }
	  void area() {
		   ar2=3.14*r*r;
	  }
	  void show() {
		  System.out.println("The area of circle is = "+ar2);
	  }
}
