
public class A1Q8 {
	public static void main(String[]args) {
		int[]a= {1,2,3,4,5};
		int[]b= {2,2,2,2,2};
		int[]c=new int[5];
		c=dot(a,b);
		
		for(int i=0;i<5;i++) {
			System.out.println(" "+c[i]);	
		}
	}
	
	public static int[] dot(int[]x,int[]y) {
		int[]z=new int[5];
		for(int i=0;i<5;i++) {
			z[i]=x[i]*y[i];
		}
			return z;
		}
}
