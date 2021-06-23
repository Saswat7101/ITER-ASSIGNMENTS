import java.util.Scanner;
public class A2Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number    ");
		int a=sc.nextInt();
		System.out.println("a \t b \t pow(a, b)");
		double p=Math.pow(a, (a+1));
		int po = (int) p;
		System.out.println(a +" \t"+ (a+1)+ " \t" +po);
		 p=Math.pow((a+1), (a+2));
		 po = (int) p;
		System.out.println((a+1)+" \t"+ (a+2)+" \t" + po);
		 p=Math.pow((a+2), (a+3));
		po = (int) p;
		System.out.println((a+2)+" \t"+ (a+3)+" \t" + po);
		 p=Math.pow((a+3), (a+4));
		po = (int) p;
		System.out.println((a+3)+" \t"+ (a+4)+" \t" + po);
		 p=Math.pow((a+4), (a+5));
		 po = (int) p;
		System.out.println((a+4)+" \t"+ (a+5)+" \t" + po);
		 p=Math.pow((a+5), (a+6));
		 po = (int) p;
		System.out.println((a+5)+" \t"+ (a+6)+" \t" + po);
	}

}
