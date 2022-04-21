package Assignment_Level_1;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(pow(x, n));
    }
    public static int pow(int x, int n) {
        int result = 1;
        while(n!=0) {
            result *= x;
            n--;
        }
        return result;
    }
}
