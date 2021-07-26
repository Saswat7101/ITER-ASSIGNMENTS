package A2Q6;

public class Triangle extends Shape {
	int b,h;
	   double  ar1;
	   Triangle(int b,int h){
		   this.b=b;
		   this.h=h;
	   }
	   void area() {
		   ar1=0.5*b*h;
	   }
	    void show() {
	    	System.out.println("The area of the triangle is = "+ar1);
	    }
}
