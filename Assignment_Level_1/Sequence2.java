package Assignment_Level_1;

import java.util.Scanner;

public class Sequence2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        for(int i=1; i<=limit; i++){
            if(i%2 != 0) {
                if(i == 1)
                    System.out.print(i * -1);
                else
                    System.out.print("," + i * -1);
            }
            else
                System.out.print("," + i);
        }
    }
}