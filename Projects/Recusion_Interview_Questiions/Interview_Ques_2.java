package Projects.Recusion_Interview_Questiions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interview_Ques_2 {
    public static int Power(int base, int exp ) {
        if(exp < 0) {
            System.out.println("Not a Valid Number or Power.");
        }
        if(exp == 0) {
            return 1;
        }
        return base * Power(base, exp-1);
    }
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        boolean restart = true;
        
        while (restart) {
            try {
                System.out.println("Enter the Number: ");
                int base = sc.nextInt();
                System.out.println("Enter the Power: ");
                int exp = sc.nextInt();
                int result= Power(base,exp);
                System.out.println(base + " raised to the Power " +exp +" is "+result + ".");

                System.out.print("Do you want to restart? (y/n): ");
                String restartInput = sc.nextLine();
            
                if (restartInput.equalsIgnoreCase("n")) {
                    restart = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number or Power.");
                sc.nextLine(); // Consume the invalid input
            }
        }

        sc.close();
    }
}
