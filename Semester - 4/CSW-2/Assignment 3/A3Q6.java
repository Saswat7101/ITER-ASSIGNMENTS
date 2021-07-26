/*
 Write a program which takes as input a phone number, specified as a string of digits, and returns all possible character sequences that correspond to the phone number. 
 The cell phone keypad is specified by a mapping that takes a digit and returns the corresponding set of characters. 
 The character sequences do not have to be legal words or phrases.
 */

import java.util.*;
public class A3Q6 {
	static String[] keycode={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static List<String> combinations(String numinp) {
		if(numinp.length()==0){
			return new ArrayList<String>();
		}
		if(numinp.length()==1){
			int index=numinp.charAt(0)-'0'; 
			String code=keycode[index];
			List<String> l= new ArrayList<>();
			for (char ch:code.toCharArray()){
				l.add(""+ch);
			}
			return l;
		}
		char ch=numinp.charAt(0);
		String str=numinp.substring(1);
		List<String> l=combinations(str);
		int index=ch-'0';
		String code=keycode[index];
		List<String> res = new ArrayList<>();
		for(int i=0;i<code.length();i++){
			char ch2=code.charAt(i);
			for(String ch3:l){
				res.add(""+ch2+ch3);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(combinations("234"));
	}
}
