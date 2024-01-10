import java.util.*;

public class Condition {
    public static void main(String[] args) {
        // if else
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // if (a==b); For Equal Statements.
        if (age > 18) {
            System.out.println("Adult");

        } else {    
            // syso - ShortTrick
            System.out.println("Not Adult");
        }

    }
}