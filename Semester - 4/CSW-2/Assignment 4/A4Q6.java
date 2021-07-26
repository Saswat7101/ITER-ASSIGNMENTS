/*
 Write a program that takes as input a singly linked list of integers in sorted order, and removes duplicates from it. The list should be sorted.
 */

public class A4Q6 {
	public static Node deleteduplicate(Node head) {
		Node temp=head;
		while(temp!=null&&temp.next!=null){
			if (temp.next.data==temp.data)
				temp.next=temp.next.next;
			else
				temp=temp.next;
		}
		return head;
	}
	public static void main(String[] args) {
		Node head=null;
		head=new Node(1, head);
		head=new Node(2, head);
		head=new Node(10, head);
		head=new Node(10, head);
		head=new Node(13, head);
		head=new Node(13, head);
		Node.display(head);
		deleteduplicate(head);
		Node.display(head);
	}
}
