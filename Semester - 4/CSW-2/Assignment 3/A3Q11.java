/*
 Run-length encoding (RLE) compression offers a fast way to do efficient on-the-fly compression and decompression of strings. 
 The idea is simple encode successive repeated characters by the repetition count and the character. 
 For example, the RLE of ”aaaabcccaa” is ”4alb3c2a”. The decoding of ”3e4f2e” returns ”eeeffffee”. 
 Implement run-length encoding and decoding functions. 
 Assume the string to be encoded consists of letters of the alphabet, with no digits, and the string to be decoded is a valid encoding.
 */

import java.util.*;
public class A3Q11 {
	public static String decoding(String s) {
		int c=0;
		StringBuilder res=new StringBuilder();
		for (int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if (Character.isDigit(ch))
				c=c*10+ch-'0' ;
			else {
				while(c>0){
					res.append(ch);
					c--;
				}
			}
		}
		return res.toString();
	}
	public static String encoding(String s) {
		int c=1;
		StringBuilder res=new StringBuilder();
		for (int i=1;i<=s.length();++i) {
			if (i==s.length()||s.charAt(i)!=s.charAt(i-1)){
				res.append(c);
				res.append(s.charAt(i-1));
				c=1;
			}
			else 
				c++ ;
		}
		return res.toString();
	}
	public static void main(String[] args) {
		System.out.println(decoding("3e4f2e"));
		System.out.println(encoding("aaaabcccaa"));
	}
}
