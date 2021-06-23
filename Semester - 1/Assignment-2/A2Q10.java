import java.util.Scanner;
public class A2Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter three points for a triangle:   ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double x3=sc.nextDouble();
        double y3=sc.nextDouble();
        double s1=(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        double Side1=Math.sqrt(s1);
        double s2=(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));
        double Side2=Math.sqrt(s2);
        double s3=(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
        double Side3=Math.sqrt(s3);
        double s=(Side1+Side2+Side3)/2;
        double area=Math.sqrt(s*(s-Side1)*(s-Side2)*(s-Side3));
        System.out.println("The area of the triangle is  :   "+area);
	}

}
