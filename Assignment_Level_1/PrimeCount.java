package Assignment_Level_1;

import java.util.Scanner;

public class PrimeCount {
    public static void main(String[] arg){
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int n = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int m = sc.nextInt();
        System.out.print("Prime numbers between " + n + " and " + m + ": ");
        for(i=n; i<=m; i++){
            for (j=2; j <= i/2; j++){
                if (i%j == 0)
                    break;
            }
            if (j > i/2)
                System.out.print(i + " ");
        }
    }
}
