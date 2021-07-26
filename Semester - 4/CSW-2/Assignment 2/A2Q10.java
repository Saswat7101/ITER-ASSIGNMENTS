/*
 Implement an algorithm that takes as input an array of distinct elements and a size,and returns a subset of the given size of the array elements. 
 All subsets should be equally likely. Return the result in input array itself.
 */

import java.util.*;
public class A2Q10 {
	public static void randomSample(int k, List<Integer> A){
        Random r=new Random();
        for(int i=0;i<k;i++){
            int index=i+r.nextInt(A.size()-i);
            Collections.swap(A,i,index);
        }
    }
    public static void display() {
    	List<Integer> l=new ArrayList<Integer>();
		Collections.addAll(l,3,7,5,11);
		randomSample(3,l);
		int c=0;
		for(int i:l) {
			if(c==3)
				break;
			System.out.print(i+" ");
			c++;
		}

    }
	public static void main(String[] args) {
		display();
	}

}
