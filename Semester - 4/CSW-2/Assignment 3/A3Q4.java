/*
 Write a program which takes as input an array of characters, and removes each ’b’ and replaces each ’a’ by two ’d’s. Specifically, along with the array, 
 you are provided an integer-valued size. Size denotes the number of entries of the array that the operation is to be applied to. You do not have to worry 
 preserving about subsequent entries. For example, if the array is ¡a, b, a,c,J¿ and the size is 4, then you can return ¡d, d,d,d, c].
 You can assume there is enough space in the array to hold the final result.
 */

import java.util.*;
public class A3Q4 {
	public static int removeElement(char[] arr) {
		int length = arr.length,c=0,a=0; 
		for (int i = 0;i<length;i++){
			if (arr[i]!='b')
				arr[c++]=arr[i];
			if (arr[i]=='a')
				a++;
		}
		int cp=c-1;
		c+=a-1;
		int size=c+1;
		while (cp>-1) {
			if (arr[cp]=='a') {
				arr[c--]='d';
				arr[c--]='d';
			}
			else
				arr[c--]=arr[cp];
			cp--;
		}
		return size;
	}
	public static void main(String[] args) {
		char [] arr= {'a','c','d','b','b','b','b','c'};
		System.out.println("Before Removal and Replacing");
		for(char ch:arr) {
			System.out.print(ch+" ");
		}
		System.out.println("\nSize "+removeElement(arr));
		System.out.println("After Removal and Replacing");
		for(char ch:arr) {
			System.out.print(ch+" ");
		}
	}

}
