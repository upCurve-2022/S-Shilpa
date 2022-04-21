package Assignment_Level_1;

import java.util.Scanner;

public class SwapThreeNums {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        int c = sc.nextInt();
        int temp;
        System.out.println("Values before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        a = a + b + c;
        b = a - (b + c);
        c = a - (b + c);
        a = a - (b + c);
        System.out.println("Values after swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
