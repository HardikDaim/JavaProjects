package Projects;

import java.util.*;

public class Average_Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days' Temperature?");
        int numDays = sc.nextInt();
        int[] temp =new int[numDays];
        // Record Temperature and find the Average
        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.println("Day " + (i+1) + "'s High Temp:");
            temp[i] = sc.nextInt();
            sum += temp[i];
        }
        double aveage = sum / numDays;
        // Count days avove Average
        int above = 0;
        for(int i = 0 ;i< temp.length; i++) {
            if(temp[i] >aveage) {
                above ++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + aveage);
        System.out.println(above + " Days' avove Average");
    }

}
