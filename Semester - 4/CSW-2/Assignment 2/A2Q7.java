/*
 Write a program that takes an integer argument and return all the primes between 1 and the integer.
 */

import java.util.*;
public class A2Q7 {
	public static  List<Integer> generatePrimes(int n){
		List<Integer> primes=new ArrayList<>();
		int c=0;
		for(int i=2;i<=n;i++) {
			c=0;
		  for(int j=2;j*j<=i;j++) {
		    if(i%j==0)
		      c++;
		  }
		  if(c==0) {
		    primes.add(i);
		  }
		}
		return primes;
	}
	public static void main(String[] args) {
		System.out.println(generatePrimes(10));
	}
}
