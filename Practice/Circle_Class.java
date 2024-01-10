import java.util.*;
class Circle{
    // Properties.
    public double radius;
    // Methods.
    public double area() {
        return Math.PI * radius * radius;
    }
    public double Perimeter() {
        return Math.PI * radius * 2;
    }
    public double Circumference() {
        // return Math.PI * radius * 2;
        // OR
        return Perimeter();
    }
}

public class Circle_Class {
    public static void main(String[] args) {
        // Creatind an OBJECT.
        Circle c1 = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle:");
        c1.radius = sc.nextDouble();
        System.out.println("Area of Circle : "+c1.area());
        System.out.println("Perimeter of Circle : "+c1.Perimeter());
        System.out.println("Circumference of Circle : "+c1.Circumference());
    }
}
