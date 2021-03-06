/*
 Write a program which takes a singly linked list L and two integers s and f as arguments, and reverses the order of the nodes from the s-th node to
 f-th node, inclusive. The numbering begins at 1, i.e., the head node is the first node. Do not allocate additional nodes.
 */

public class A4Q3 {
	public static Node reverse(Node head,int s,int f){
		Node p=null;
		Node q=head;
		for (int i=1;q!=null&&i<s;i++){
			p=q;
		    q=q.next;
		 }
		Node start=q;
		Node end=null;
		for (int i=1;q!=null&&i<=f-s+1;i++){
			Node next=q.next;
		    q.next=end;
		    end=q;
		    q=next;
		  }
		  start.next=q;
		  if (p!=null)
		    p.next=end;
		  else 
		    head=end;
		  return head;
	}
	public static void main(String[] args) {
        int s=2,f=6;
        Node head = null;
        for (int i=7;i>=1;i--) {
            head=new Node(i, head);
        }
        Node.display(head);
        head=reverse(head,s,f);
        Node.display(head);
    }
}
