package String_Assignment;

import java.util.Scanner;

public class ImmutableString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();
        System.out.println(str1.hashCode());
        System.out.print("Enter string to concat: ");
        String str2 = sc.nextLine();
        str1 = str1+str2;
        System.out.println("After concatenation: "+str1);
        System.out.println(str1.hashCode());
        System.out.println("Shows that string is Immutable since hashcode changed");
    }
}
