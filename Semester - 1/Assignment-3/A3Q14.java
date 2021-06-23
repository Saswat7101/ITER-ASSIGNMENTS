import java.util.Scanner;
public class A3Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of 3 sides of a triangle ");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int c=0;
		if(s1==s2)
		c++;
		if(s2==s3)
		c++;
		if(s1==s3)
		c++;
		if(c==0)
		System.out.println("Triangle is irregular");
		else if(c==1)
		System.out.println("Triangle is symmetric");
		else
		System.out.println("triangle is regular");
	}

}
