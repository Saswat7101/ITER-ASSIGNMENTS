package A2Q6;

public class Square extends Shape {
	int x;double ar;
	 Square(int x){
    this.x=x;
}
   void area() {
    ar=x*x;
   }
   void show() {
   	System.out.println("The area of the square = "+ar);
   	
}
}
