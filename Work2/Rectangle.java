import java.util.*;
public class Rectangle {
    double length,breadth;
    
    
    Rectangle(double a, double b){
        length=a;
        breadth=b;

    }
    void getArea(){
        double area=length*breadth;
        System.out.println("Area="+area);

    }
    void getPerimeter(){
        double perimeter=2*(length+breadth);
        System.out.println("Perimeter="+perimeter);

    }
    public static void main(String args[])
    {
        System.out.println("Enter the length and breadth values:");
        Scanner s = new Scanner(System.in);
        double l=s.nextDouble();
        double b=s.nextDouble();
        Rectangle rect=new Rectangle(l,b);
        rect.getArea();
        rect.getPerimeter();


    }
}
