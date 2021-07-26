/*
 Define a function to create a lookup table of size 216 whose value is the parity bits of the index.
 */

public class A1Q5 {
	public static int computepartity(int x){
        int result = 0;
		while (x != 0) {
		    result^= 1;
		    x &= (x - 1);
		}
		return result;
    }
    public static void lookupTable(){
        int parity[] =new int[(int)Math.pow(2, 16)];
        for(int i=0;i<parity.length;i++){
            parity[i]=computepartity(i);
        }
    }
    // public static void main(String[] args) {
        
    // }
}
