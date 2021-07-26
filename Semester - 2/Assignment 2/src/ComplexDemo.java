import java.util.Scanner;
public class ComplexDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter real and image part of complex num1");
      double r=sc.nextDouble();
      double i=sc.nextDouble();
      complex c1=new complex();
      c1.setdata(r, i);
      System.out.println("enter real and image part of complex num2");
      double r2=sc.nextDouble();
      double i2=sc.nextDouble();
      complex c2=new complex();
      c2.setdata(r2, i2);
      complex c3=c1.add(c1, c2);
      System.out.println("complex number1");
      c1.display();
      System.out.println("complex number2");
      c2.display();
      System.out.println("addition");
      System.out.println("result="+c3.real+"i"+c3.imag);
      

	}

}
class complex{
	double real;
	double imag;
	void setdata(double real,double imag) {
		this.real=real;
		this.imag=imag;
	}
	void display() {
		System.out.println("real="+real);
		System.out.println("image="+imag);
	}
	complex add(complex c1,complex c2) {
		complex temp=new complex();
		temp.real=c1.real+c2.real;
		temp.imag=c1.imag+c2.imag;
		return temp;
	}
}
