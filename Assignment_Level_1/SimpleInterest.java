package Assignment_Level_1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        float P = sc.nextFloat();
        System.out.print("Enter the time in years: ");
        float T = sc.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float R = sc.nextFloat();
        double interest = (P*T*R)/100;
        System.out.println("Interest is " + interest);
    }
}
