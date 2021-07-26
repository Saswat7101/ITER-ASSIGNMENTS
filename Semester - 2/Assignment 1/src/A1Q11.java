import java.util.Scanner;
class Point{
    int x,y;
    void setPoint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate");
        x = sc.nextInt();
        System.out.println("Enter y coordinate");
        y = sc.nextInt();
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}

public class A1Q11 {
 public static double findDistance(Point a,Point b)
 {
     double distance = Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
     return distance;
 }

    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        a.setPoint();
        b.setPoint();
        System.out.println("Distance="+findDistance(a,b));
    }
    }
