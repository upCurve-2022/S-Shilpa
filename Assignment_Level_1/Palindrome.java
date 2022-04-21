package Assignment_Level_1;

import java.util.Scanner;

public class Palindrome {
    public static String reverseString(String str){
        String revstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            revstr = ch + revstr;
        }
        return revstr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        String revstr=reverseString(str);
        if(str.equalsIgnoreCase(revstr))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a Palindrome");
    }
}
