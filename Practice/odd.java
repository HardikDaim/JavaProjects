import java.util.Scanner;

public class odd {
    public static void Sum(int n) {
        int sum = n ^ 2;
        System.out.print("Sum of odd numbers is "+ sum);
    
    }

    public static void main(String[] args) {
        System.out.print("Sum of odd numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sum(n);
    }
}
