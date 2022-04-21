package String_Assignment;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("String length is "+str.length());
    }
}
