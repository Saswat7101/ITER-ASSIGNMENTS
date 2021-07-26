/*
 Implement a function that converts a spreadsheet column id to the corresponding integer, with ”A” corresponding to 1. 
 For example, you should return 4 for ”D”, 27 for ”AA”, 702 for ”ZZ”, etc. How would you test your code?
 */

import java.util.*;
public class A3Q3 {
	public static int colnum(String s) {
		int colcount=0,i=0,len=s.length();
		while(len>0) {
			colcount*=26;
			colcount+=s.charAt(i)-'A'+1;
			i++;
			len--;
		}
		return colcount;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		System.out.println(colnum(s.toUpperCase()));
	}
}
