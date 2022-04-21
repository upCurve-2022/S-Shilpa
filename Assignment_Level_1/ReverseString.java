package Assignment_Level_1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        String revstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            revstr = ch + revstr;
        }
        System.out.println(revstr);
    }
}
