/*
 Write a program that takes the head of a singly linked list and returns null if there does not exist a cycle, and the node at the start of the cycle, 
 if a cycle is present. (You do not know the length of the list in advance.)
 */

public class A4Q4 {
	static Node head;
	public static Node cycle(){
		Node slow=head,fast=head;
	    boolean flag=false;
	    while (slow!=null&&fast!=null&& fast.next != null) {
	    	slow=slow.next;
	    	fast =fast.next.next;
	    	if (slow==fast) {
	    		flag=true;
	    		break;
	    	}
	    }
	    if (flag)
	    	return head;
	    return null;
	    
	}
	public static void main(String[] args) {
		head=null;
	    for (int i=3;i>=1;i--) {
	        head=new Node(i,head);
	    }
	    head.next.next.next=head;
	    System.out.println(cycle());
	}
}
