public class A4Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		double r,s=0,avg=0;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++){
		r=Math.random();
		System.out.println("Random no."+i+"="+r);
		s+=r;
		}
		System.out.println("Sum of the random numbers="+s);
		avg=s/n;
		System.out.println("average="+avg);
	}

}

