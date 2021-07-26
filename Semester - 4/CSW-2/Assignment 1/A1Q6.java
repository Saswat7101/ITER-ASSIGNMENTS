/*
 Write a program to calculate the parity bit of a 64 bit word using look up table in O(n/L) time, where n is the word size and L is the group size.
 Note: Consider group size is 16 bit for the problem.
 */

import java.util.Scanner;
public class A1Q6 {
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
    public static long parity(long x){
        int ws = 16;
		int bm = 0xFFFF;
		return(computepartity((int)(x>>(3*ws))&bm)^computepartity((int)(x>>(2*ws))&bm)^computepartity((int)(x>>(ws))&bm)^computepartity((int)x&bm));
    }
    public static void main(String[] args) {
        lookupTable();
        Scanner sc=new Scanner(System.in);
        long x=Long.parseLong(sc.nextLine(),2);
        System.out.println(parity(x));
        sc.close();
    }
}
