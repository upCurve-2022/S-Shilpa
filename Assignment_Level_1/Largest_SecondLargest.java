package Assignment_Level_1;

import java.util.Scanner;

public class Largest_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c) {
            if(b>c)
                System.out.println("Largest is " + a + " Second Largest is " + b);
            else
                System.out.println("Largest is " + a + " Second Largest is " + c);
        }
        else if(b>a && b>c) {
            if(a>c)
                System.out.println("Largest is " + b + " Second Largest is " + a);
            else
                System.out.println("Largest is " + b + " Second Largest is " + c);
        }
        else if(c>a && c>b) {
            if(a>b)
                System.out.println("Largest is " + c + " Second Largest is " + a);
            else
                System.out.println("Largest is " + c + " Second Largest is " + b);
        }
    }
}
