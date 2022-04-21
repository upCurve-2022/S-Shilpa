package Assignment_Level_1;

import java.util.Scanner;

public class NumInWords {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n, rev = 0;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        while(n!=0) {
            rev = (rev*10)+(n%10);
            n/=10;
        }
        System.out.println("num = "+rev);
        while(rev!=0) {
            switch(rev%10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            rev/=10;
        }
    }
}
