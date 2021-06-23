
public class A2Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
	    int b=Integer.parseInt(args[1]);
	    int c=Integer.parseInt(args[2]);
	    int m1= Math.max(a,Math.max(b,c));
	    int m2= Math.min(a,Math.min(b,c));
	    int tot= a+b+c;
	    int m3= tot-(m1+m2);
	    System.out.println(m2+" "+m3+" "+m1);
	}

}
