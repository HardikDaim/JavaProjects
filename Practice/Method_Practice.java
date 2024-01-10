import java.util.Scanner;

public class Method_Practice {

    // Method to Calculate the Area of Circle.
    static double area(double radius) {
        return Math.PI * radius * radius;
    }
    // Method to Calculate the Area of Rectangle.
    static double area(double length, double breadth) {
        return length * breadth;
    }
    // Method to calculate the Area of Trapezium.
    static double area(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }
    // Method to Reverse a Number.
    static int reverse(int n) {
        int rev = 0;
        while(n>0) {
            rev = rev * 10 + rev%10;
            n = n/10;
        }
        return rev;
    }
    // Method to Reverse an Array.
    static int[] reverse(int A[]){
        int B[]= new int[A.length];

        for(int i=A.length-1,j=0;i>=0;j++) 
        B[j] = A[i];

        return B;
    }
}
