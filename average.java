import java.util.Scanner;

public class average {
    public static void average(float a, float b, float c) {
        float average;
        average = (a+b+c)/3;
        System.out.println(average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        average(a, b, c);
    }
}
