package Assignment_Level_1;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int evensum = 0, oddsum = 0;
        for(int i=0; i<=n; i++){
            if(i%2 == 0)
                evensum = evensum+i;
            else
                oddsum = oddsum+i;
        }
        System.out.println("Even sum = " + evensum + "\nOdd sum = " + oddsum);
    }
}
