package Assignment_Level_1;

import java.util.Scanner;

public class SwapTwoNums {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();
        int temp;
        System.out.println("Values before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Values after swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
