package String_Assignment;

import java.util.Scanner;

public class StringEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        if (str == null || str.isEmpty())
            System.out.println("string is empty");
        else
            System.out.println("string is not empty");

    }
}
