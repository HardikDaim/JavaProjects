import java.util.Scanner;
public class Menu_Driven_Program {
    // Make a Menu Driven Program for Arithmetic Operations.
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("===");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter frist Number:");
        int x = sc.nextInt();
        System.out.println("Enter Second Number:"); 
        int y = sc.nextInt();
        System.out.println("Enter the Operation you want to perform(in Words):");
        String operation = sc.nextLine();
        switch(operation) {
            case "ADD" : System.out.println(x + y);
            break;
            case "SUB" : System.out.println(x-y);
            break;
            case "MUL" : System.out.println(x*y);
            break;
            case "DIV" : System.out.println(x/y);
            break;
            default: System.out.println("Invalid Operation");
            break;
        }
    }
}
