package Assignment_Level_1;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] arg){
        double decNum = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();
        while(binNum>0){
            int temp = binNum%10;
            decNum = decNum + (temp*Math.pow(2,i));
            i++;
            binNum = binNum/10;
        }
        System.out.print("Decimal number: " + decNum);
    }
}
