class Student1
{
      String name;
      int roll;
      double mark;

     
      void setData(String n,int r, double m) { 
    	name=n;
	  roll = r;
	  mark = m;
      }
      void setData() { 
          System.out.println("Student Info :- ");
          System.out.println("NAME="+name+ " Roll:" + roll + "  Mark:" + mark);
      }
}

public class StudentDetaills1
{
   public static void main(String args[]) {
      Student1 stud1 = new Student1();
      stud1.setData("roy",51,98); 
      Student1 stud2 = new Student1(); 
      stud2.setData("akira",21,67.5);
      
      stud1.setData();
      stud2.setData();
   }
}


