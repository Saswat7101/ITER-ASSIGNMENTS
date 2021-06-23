import java.util.Scanner;
public class A3Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double x,y;
		System.out.println("Enter the x and y coordinate respectively: ");
		x=sc.nextDouble();
		y=sc.nextDouble();
		if(x==0)
		System.out.println("("+x+","+y+")is on the y-axis");
		else if(y==0)
		System.out.println("("+x+","+y+") is on the x-axis");
		else if((x>0)&&(y>0))
		System.out.println("("+x+","+y+") is on the first quadrant");
		else if((x<0)&&(y>0))
		System.out.println("("+x+","+y+") is on the second quadrant");
		else if((x<0)&&(y<0))
		System.out.println("("+x+","+y+") is on the third quadrant");
		else
		System.out.println("("+x+","+y+") is on the fourth quadrant");
		
	}

}
