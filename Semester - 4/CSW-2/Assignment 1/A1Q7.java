/*
 Write a program to calculate parity bit of a 64 bit word using only xor and right shift operator.
 */

import java.util.Scanner;
public class A1Q7 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.close();
        int n=((int)(Math.log(x)/Math.log(2)+1))/2;
		while(n>=1) {
			x^=x>>n;
			n/=2;
		}
		System.out.println(x&1);
    }
}
