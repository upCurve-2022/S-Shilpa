package Assignment_Level_1;

import java.util.Scanner;

public class Sequence4 {
    public static void main(String[] arg){
        int a = 1, b = 4, c = 7, next;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        System.out.print(a + "," + b + "," + c);
        for(int i=4; i<=limit; i++){
            next = a+b+c;
            System.out.print("," + next);
            a = b;
            b = c;
            c = next;
        }
    }
}
