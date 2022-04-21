package Assignment_Level_1;

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] arg){
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decNum = sc.nextInt();
        int[] binNum = new int[25];
        while(decNum>0){
            binNum[index++] = decNum%2;
            decNum = decNum/2;
        }
        System.out.print("Binary Number: ");
        for(int i=index-1; i>=0; i--){
            System.out.print(binNum[i]);
        }
    }
}
