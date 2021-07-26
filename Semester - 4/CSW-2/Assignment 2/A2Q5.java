/*
 Write a program that takes an array denoting the daily stock price, and return the maximum profit that could be made by buying and then selling one share of that stock.
 */

import java.util.*;
public class A2Q5 {
	public static int profit(List<Integer>l) {
		String mi="",ma="";
		int min=Integer.MAX_VALUE,max=0;
		for(int p:l) {
			min=Math.min(min, p);
			mi+=min+" ";
			max=Math.max(max, p-min);
			ma+=max+" ";
		}
		System.out.println(mi);
		System.out.println(ma);
		return max;
	}
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		Collections.addAll(l,310,315,275,295,260,270,290,230,255,250);
		System.out.println(profit(l));
	}
}
