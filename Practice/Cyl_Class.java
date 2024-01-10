import java.util.*;
class Cyl {
    // Properties.
    public double radius;
    public double height;
    // Methods.
    public double LidArea() {
        return Math.PI * radius * radius;
    }
    public double TotalSurfaceArea() {
        return 2 * LidArea() + 2 * Math.PI * radius;
    }
    public double Volume() {
        return 2 * Math.PI * radius * height;
    }
    
}
public class Cyl_Class {
    public static void main(String[] args) {
        Cyl c1 = new Cyl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Cylinder : ");
        c1.radius = sc.nextDouble();
        System.out.println("Enter the Height of Cylinder : ");
        c1.height = sc.nextDouble();

        System.out.println("Required Lid Area is : " + c1.LidArea());
        System.out.println("Required Total Surface Area is : " + c1.TotalSurfaceArea());
        System.out.println("Required Volume is : " + c1.Volume());

    }
}
