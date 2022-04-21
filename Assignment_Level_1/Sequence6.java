package Assignment_Level_1;

import java.util.Scanner;

public class Sequence6 {
    public static void main(String[] arg){
        int factor=0, j=4;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        for(int i=1; i<=limit; i++){
            if(i%2 != 0) {
                if (i == 1) {
                    System.out.print(i);
                    factor = i;
                }
                else{
                    factor = factor+j;
                    System.out.print("," + factor);
                    j = j+8;
                }
            }
            else{
                factor = factor+j;
                System.out.print("," + factor);
                j = j+4;
            }
        }
    }
}
