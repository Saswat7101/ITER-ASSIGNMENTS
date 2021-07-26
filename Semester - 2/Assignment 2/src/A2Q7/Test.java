package A2Q7;

public class Test implements A {
	int maxCount;
	String name;
	Test(String n){
		name=n;
	
	}
	
	public void display(){
		System.out.println("Name: "+name);
		
		
	}
	public void count() {
		maxCount=name.length();
		System.out.println("Number of character in name: "+maxCount);
	}
}
