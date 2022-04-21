package Assignment_Level_1;

import java.util.Scanner;

public class WholeAndFraction {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = sc.nextDouble();
        int b = (int)a;
        double c = a - b;
        c = c*100;
        int k = (int)c;
        System.out.println(b + " " + k);
    }
}
