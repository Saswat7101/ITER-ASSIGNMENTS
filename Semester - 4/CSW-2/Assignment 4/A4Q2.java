/*
 Write a program that takes two lists, assumed to be sorted, and returns their merge. The only field your program can change in a node is its next field.
 */

public class A4Q2 {
	Node head=null,tail=null;
	public void add(int data){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
			tail=head;
			return;
		}
		tail.next=newnode;
		tail=newnode;
	}
	public Node mergeTwoLists(Node l1,Node l2) {
		if (l1==null)
			return l2;
		if (l2==null)
			return l1;
		if (l1.data<l2.data){
			l1.next=mergeTwoLists(l1.next,l2);
			return l1;
		}
		else{
			l2.next=mergeTwoLists(l1,l2.next);
			return l2;
		}
	}
	public static void main(String[] args) {
		A4Q2 ml=new A4Q2();
		A4Q2 ml2=new A4Q2();
		ml.add(0);
		ml.add(1);
		ml.add(2);
		Node.display(ml.head);
		ml2.add(4);
		ml2.add(5);
		ml2.add(7);
		Node.display(ml2.head);
		ml.head=new A4Q2().mergeTwoLists(ml.head, ml2.head);
		Node.display(ml.head);
	}
}
