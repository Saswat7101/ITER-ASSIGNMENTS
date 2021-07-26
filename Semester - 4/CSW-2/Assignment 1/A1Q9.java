/*
 Design a function to create a lookup table A such that for every 16 bit number y, A[y] holds the bit-reversal of y
 */

public class A1Q9 {
	static long A[];
    public static int computeReverse(int n){
        int c=16;
        String b="";
        while(n!=0||c!=0){
            b+=(n%2);
            n/=2;
            c--;
        }
        return (Integer.parseInt(b,2));
    }
    public static void lookupTable(){
        A=new long[(int)Math.pow(2, 16)];
        for(int y=0;y<A.length;y++){
            A[y]=computeReverse(y);
        }
    }
    // public static void main(String[] args) {
        
    // }
}
