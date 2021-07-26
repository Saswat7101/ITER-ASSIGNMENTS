/*
 Write a program to find the parity bit of a number in O(k) time, where k is the number of set bits.
 */

public class A1Q3 {
	public static void main(String[] args) {
        long x = 0b1011;
		short result = 0;
		while (x != 0) {
		    result^= 1;
		    x &= (x - 1);
		}
		System.out.println("Final answer = "+result);
    }
}
