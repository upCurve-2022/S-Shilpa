package Assignment_Level_1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        int rev=0;
        System.out.print("Enter a number: " );
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0) {
            rev = (rev*10)+ n%10;
            n = n/10;
        }
        System.out.println("Reversed number is " + rev);
    }
}
