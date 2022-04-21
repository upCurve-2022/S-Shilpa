package Assignment_Level_1;

import java.util.Scanner;

public class Sequence1 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        for(int i=2; i<=limit; i=i+2){
            if(i==2)
                System.out.print(i*i);
            else
                System.out.print("," + i*i);
        }
    }
}
