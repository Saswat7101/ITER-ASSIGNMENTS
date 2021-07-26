import java.util.Scanner;

public class singleMain{
public static void main( String [] args){

Scanner sc=new Scanner(System.in);

singleLinkedList list = new singleLinkedList();

System.out.println("Creating  student linked list :- ");  

list.create();

System.out.println("Select from menu-list to perform follwing operations :");
  while(true){
System.out.println("--------Operation Lists--------");
System.out.println("1:  Exit ");
System.out.println("2:  Count number of Nodes in Single Linked List ");
System.out.println("3:  Insert in the beginning of Linked List ");
System.out.println("4:  Insert at end of Linked List ");
System.out.println("5:  Insert at specified location in the Linked List"); 
System.out.println("6:  Search in Single  Linked List");
System.out.println("7:  Sort Single Linked List ");
System.out.println("8:  Delete at the Beginning of Single Linked List");
System.out.println("9:  Delete at the end of Single Linked List");
System.out.println("10: Delete at specific location of Linked List");
System.out.println("11: Delete at specific location (registration number wise ) of Linked List");
System.out.println("12: Reverse Linked LIst ");
System.out.println("13: Display  Student Single Linked List");

System.out.println("Input your choice ");

int choice=sc.nextInt(); 

switch(choice)
{

	case 1: System.exit(0); break; 

	case 2: int countNodes= list.count();
			System.out.println("No. of Nodes in Linked List are : " + countNodes);
			break;

	case 3: list.insBeg(); break;

	 case 4: list.insEnd(); break;

	case 5: System.out.println("Specify the location to insert node in Linked List");
		int loc= sc.nextInt();
		list.insLoc(loc); break;

	case 6: System.out.println("Input element (Registration number ) to search");
		int ele=sc.nextInt();
		float elemMark =list.search(ele);
		if(elemMark!=-1){

		System.out.println( ele +" mark = " + elemMark ); 
		    }

		else{
			System.out.println("No data found " );
		     } break;

	case 7:  list.sort(); break;

	case 8: list.delBeg(); break;

	case 9:  list.delEnd(); break;

	case 10: System.out.println("Insert delete position");

		int pos=sc.nextInt();
		list.delLoc(pos); break;

	case 11: System.out.println("enter registration number");
		 
		int registrationNumber=sc.nextInt();
		 list.delLocRegNum(registrationNumber);

	case 12: list.reverse(); break; 
	
	case 13:  list.display();  break;

	 default: System.out.println("Invalid Input");
} 

      } 

        }
	     }





