import java.util.*;
public class A4Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number whose multiplication table you want to find: ");
		int num=sc.nextInt();
		for(i=1;i<=10;i++){
		r=1;
		r=num*i;
		System.out.println(num+"x"+i+"="+r);
		}
	}

}

