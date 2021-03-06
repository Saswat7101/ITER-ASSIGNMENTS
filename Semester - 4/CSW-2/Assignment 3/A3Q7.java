/*
 Write a program that takes as input an integer n and returns the nth integer in the look-and-say sequence. Return the result as a string.
 */

import java.util.*;
public class A3Q7 {
	public static String lookAndSay(int n) {
		String s="1";
		for (int i=1;i<n;i++)
			s=nextNumber(s);
		return s;
	}
	private static String nextNumber(String s) {
		StringBuilder result=new StringBuilder();
		for (int i=0;i<s.length();i++) {
			int count=1 ;
			while (i+1<s.length()&&s.charAt(i)==s.charAt(i+1)) {
				i++;
				count++;
			}
			result.append(count);
			result.append(s.charAt(i));
		}
		return result.toString();
	}
	public static void main(String[] args) {
		System.out.println(lookAndSay(2));
	}
}
