
public class A2Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
	    int b=Integer.parseInt(args[1]);
	    int s1=a+(int)(Math.random()*(b-a+1));
	    int s2=a+(int)(Math.random()*(b-a+1));
        int sum = s1+s2;
        System.out.println(sum);
	}

}
