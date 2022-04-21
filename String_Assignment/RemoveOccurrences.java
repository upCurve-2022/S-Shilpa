package String_Assignment;

import java.util.Scanner;

public class RemoveOccurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        System.out.print("Enter character to remove: ");
        char c =sc.nextLine().charAt(0);
        int n =s.length();
        String str="";
        for (int i= 0; i < n; i++)
            if (s.charAt(i) != c)
                str = str + s.charAt(i);
        System.out.println(str);
    }
}
