import java.util.Scanner;

public class exp {
    public static void exponent(int a, int b) {
        int exp = a^b;
        System.out.println(exp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        exponent(a,b);
    }
}
