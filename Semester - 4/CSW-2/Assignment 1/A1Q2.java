/*Write a program to find the parity bit of a number in O(n) time, where n is the word size.*/

public class A1Q2 {
	public static void main(String[] args) {
        int n=10,c=0;
		while(n>0) {
			c^=(n&1);
			n>>=1;
		}
		System.out.println(c);
    }
}
