package String_Assignment;

import java.util.Scanner;

public class ContainsOnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                flag++;
                break;
            }
        }
        if (flag == 0)
            System.out.println("String contains only digits");
        else
            System.out.println("String contains digits and other characters");
    }
}
