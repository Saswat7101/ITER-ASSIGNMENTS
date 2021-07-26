import java.util.Scanner;

public class singleLinkedList {

	 Node head=null;
	
	Scanner sc=new Scanner(System.in);

/*------------------------------------------------------------------------ create method operation---------------------------------------------------------------------------*/
	
	public   void create()

	{
		Node p=new Node();

		 int regNum;
		 float m;

		
		System.out.println("Input registration number for first node");
		regNum=sc.nextInt();

		p.setRegdNo(regNum);

		System.out.println("Input mark for first node");
		 m=sc.nextFloat();

		p.setMarks(m);

		p.setNext(null);

		head=p;


		System.out.println("Do you want more nodes(y/n)");

		char ch=sc.next().charAt(0);
		while(ch!='n')
		{
			Node q=new Node();

			System.out.println("Input registration number ");
			regNum=sc.nextInt();
			q.setRegdNo(regNum);

			System.out.println("Input mark");
			 m=sc.nextFloat(); 
			q.setMarks(m);

			q.setNext(null);
			
			p.next=q;

			p=q;

			System.out.println("Do you want more nodes(y/n)");
			ch=sc.next().charAt(0);
		}
	}


/*------------------------------------------------------------------------ create method operation---------------------------------------------------------------------------*/




/*------------------------------------------------------------------------ display method operation---------------------------------------------------------------------------*/
	

	 public void display()
	{
		Node p=head;

		System.out.println("Start= "+head);

		while(p!=null)
		{	
			float studentMark=p.getMarks();
			 int studentRegdNumber=p.getRegdNo();

			System.out.println(studentRegdNumber+"   "+studentMark+"  " + p.next);
			p=p.next;
		}		
	}


/*------------------------------------------------------------------------ display method operation---------------------------------------------------------------------------*/





/*------------------------------------------------------------------------ count method operation---------------------------------------------------------------------------*/


	public  int count()
	{
		int c=0;
		Node p=head;
		while(p!=null)
		{
			c++;
			p=p.next;
		}		
		return c;
	}


/*------------------------------------------------------------------------ count method operation---------------------------------------------------------------------------*/





/*------------------------------------------------------------------------ search method operation---------------------------------------------------------------------------*/


	public  float search(int ele)
	{
		int pos=0;
		Node p=head;
		while(p!=null)
		{
			pos++;
			int studentInfo=p.getRegdNo();
			if(studentInfo==ele){
			float studentMark=p.getMarks();
				return  studentMark;
			}
			p=p.next;
		}
		return -1;
	}



/*------------------------------------------------------------------------ search method operation---------------------------------------------------------------------------*/






/*------------------------------------------------------------------------ Insertion Beginning method operation---------------------------------------------------------------------------*/
	public  void insBeg()
	{
		Node p=new Node();

		int regNum;
		 float m;

		System.out.println(" to insert at beginning Input Registration number");
		regNum=sc.nextInt();

		p.setRegdNo(regNum);

		System.out.println("Input mark for first node");
		 m=sc.nextFloat();

		p.setMarks(m);
		
		p.setNext(null);

		p.next=head;
		head=p;
		
				
	}



/*------------------------------------------------------------------------ Insertion Beginning method operation---------------------------------------------------------------------------*/





/*------------------------------------------------------------------------ Insertion End method operation---------------------------------------------------------------------------*/
	 public  void insEnd()
	{
		Node p=new Node();
		
		int regNum;
		 float m;

		System.out.println(" to insert node at end Input Registration number");
		regNum=sc.nextInt();

		p.setRegdNo(regNum);

		System.out.println("Input marks");
		 m=sc.nextFloat();

		p.setMarks(m);
		
		p.setNext(null);

		
		if(head==null)
		{
			head=p;
		}
		else
		{
		Node q=head;
		while(q.next!=null)
			q=q.next;		
		
			q.next=p;			
		}
	}


/*------------------------------------------------------------------------ Insertion End method operation---------------------------------------------------------------------------*/




/*------------------------------------------------------------------------ Insertion at Location method operation---------------------------------------------------------------------------*/
	 public  void insLoc(int loc)
	{
		
		int c=count();
		if(loc<=c+1)
		{
			if(loc==1)
				insBeg();
			else if(loc==c+1)
				insEnd();
			else
			{
				Node p=new Node();
				int regNum;
		 		float m;

				System.out.println(" to insert node at end Input Registration number");
				regNum=sc.nextInt();

				p.setRegdNo(regNum);

				System.out.println("Input marks");
				 m=sc.nextFloat();

				p.setMarks(m);
				p.setNext(null);
				
				Node q=head;
				int cnt=1;
				while(cnt<loc-1)
				{
					cnt++;
					q=q.next;
				}
				
				p.next=q.next;
				q.next=p;
			}
		}
	}


/*------------------------------------------------------------------------ Insertion at Location method operation---------------------------------------------------------------------------*/



/*------------------------------------------------------------------------ Deletion Beginning method operation---------------------------------------------------------------------------*/
	 public void delBeg()
	{
		if(head==null)
		{
			System.out.println("No lists created !");
			return;
		}
			
		Node p=head;
		Node q=p.next;
		head=q;
		p.next=null;		
	}



/*------------------------------------------------------------------------ Deletion Beginning method operation---------------------------------------------------------------------------*/



/*------------------------------------------------------------------------ Deletion End method operation---------------------------------------------------------------------------*/
	 public  void delEnd()
	{
		if(head==null)
		{
			System.out.println("List absent");
			return;
		}
		if(head.next==null)
		{
			delBeg();
		}
		else
		{
		Node q=head;
		while(q.next.next!=null)
			q=q.next;	
		
		q.next=null;
		}
	}


/*------------------------------------------------------------------------ Deletion at Location method operation---------------------------------------------------------------------------*/



	public void delLoc(int pos){
	int c=count();
		if(pos<=c+1)
		{
			if(pos==1)
				delBeg();
			else if(pos==c+1)
				delEnd();
			else
			{
				Node p=head;
				int cnt=1;
			while(cnt<pos-1){
				 	p=p.next;
					 cnt++;
					}
			Node q=p.next.next;
			p.next.next=null;
			p.next=q;
				
			}
		}

		else{
			System.out.println("deletion error : list overflow");


}
}

/*------------------------------------------------------------------------ Deletion at location method operation---------------------------------------------------------------------------*/




/*------------------------------------------------------------------------ Deletion at location (registration number) method operation-----------------------------------------------------------*/


public void delLocRegNum(int rnum){

Node p=head;
int q=1;
int sRegd_Num=p.getRegdNo();

while(p!=null && rnum!=sRegd_Num){
q++;
p=p.next;
}

if (q==count()){
System.out.println("No data found");
}

else{

	delLoc(q);

}

}



/*------------------------------------------------------------------------ Deletion at location (registration number) method operation--------------------------------------------------------------*/





/*------------------------------------------------------------------------ Reversing SLL method operation---------------------------------------------------------------------------*/
	
	  public void reverse()
	{
		     int count =count();

			if(count>=2)
		{
			Node p=null;
			Node q=head;
			Node r=head.next;
			q.next=null;
			while(r!=null)
			{
				p=q;
				q=r;
				r=r.next;
				q.next=p;
			}
			head=q;
		}
	
	}


/*------------------------------------------------------------------------ Reversing SLL method operation---------------------------------------------------------------------------*/




/*------------------------------------------------------------------------ Sorting method operation---------------------------------------------------------------------------*/
	 public  void sort()
	{
		 Node p,q;
		for(p=head;p.next!=null;p=p.next)
		{
			for(q=head;q.next!=null;q=q.next)
			{	
				 float s1Mark=q.getMarks();
				 float s2Mark=q.next.getMarks();
			
				if(s1Mark > s2Mark)
				{
					 float temp=s1Mark;
					s1Mark=s2Mark;
					s2Mark=temp;
				}
			}
		}
	}  

/*------------------------------------------------------------------------ Sorting method operation---------------------------------------------------------------------------*/

}
