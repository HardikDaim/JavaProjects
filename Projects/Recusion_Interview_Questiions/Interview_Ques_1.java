package Projects.Recusion_Interview_Questiions;

import java.util.InputMismatchException;
import java.util.Scanner;

// To find the Sum of digits of Positive integer.
public class Interview_Ques_1 {
    public static int SumOfDigits(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + SumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean restart = true;

        while (restart) {
            try {
                System.out.println("Enter the Number:");
                int n = sc.nextInt();
                sc.nextLine(); // Consume the newline character

                int result = SumOfDigits(n);
                System.out.println("The Sum of Digits of " + n + " is " + result);

                System.out.print("Do you want to restart? (y/n): ");
                String restartInput = sc.nextLine();

                if (restartInput.equalsIgnoreCase("n")) {
                    restart = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine(); // Consume the invalid input
            }
        }

        sc.close();
    }
}
