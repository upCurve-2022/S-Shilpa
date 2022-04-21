package String_Assignment;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second String: ");
        String str2 = sc.nextLine();
        System.out.println("Comparison using equals() method:");
        System.out.println(str1.equals(str2));
        System.out.println("Comparison using compareTo() method:");
        System.out.println(str1.compareTo(str2));
    }
}
