public class A4Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		double s=0,t=0,p=0;
		System.out.println("log N,			N,	NlogN,			N2,		N3,			2N ");
		for(N=16;N<=2048;N=N*2)
		{
		System.out.println(Math.log(N)+"\t"+N+"\t"+N*Math.log(N)+"\t"+Math.pow(N,2)+"\t	"+Math.pow(N, 3)+"\t		"+Math.pow(2, N));
		}
	}

}

