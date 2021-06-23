
public class A2Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
	    int b=Integer.parseInt(args[1]);
	    int c=Integer.parseInt(args[2]);
	    boolean x=((b+c)<=a||(a+c)<=b||(b+a)<=c);
	    System.out.println(x);
	}

}
