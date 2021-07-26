/*
 Implement a function which takes as input a string s and returns true if s is a palindromic string.
 */

import java.util.*;
public class A3Q5 {
	public static boolean isPalindrome(String s) {
		String ss = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		return ss.equals(new StringBuilder(ss).reverse().toString());
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("Able was I, ere I saw Elba!"));
	}
}
