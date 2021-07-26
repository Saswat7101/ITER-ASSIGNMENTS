import java.util.Scanner;
class Flower{
String name;
int petals;
int price;

void setData() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter name");
name = sc.nextLine();
System.out.println("Enter number of petals");
petals = sc.nextInt();
System.out.println("Enter the price");
price = sc.nextInt();
}
void display() {
System.out.println(name);
System.out.println(petals);
System.out.println(price);	
}
}
public class A1Q12 {
public static void main(String[] args) {
Flower f1 = new Flower();
Flower f2 = new Flower();
Flower f3 = new Flower();
   f1.setData();
   f2.setData();
   f3.setData();
   f1.display();
   f2.display();
   f3.display();
}
}

