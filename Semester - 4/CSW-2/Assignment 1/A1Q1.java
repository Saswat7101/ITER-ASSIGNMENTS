/*Write a java program to count the number of bits that are set 1 in an integer. Also prove that time complexity is O(n) where n is the number of bits*/

public class A1Q1 {
	public static void main(String[] args) {
        int n=10;
		int c=0;
        while(n>0){
        	c+=n&1;
            n>>=1;
        }
        System.out.println(c);
    }
}
