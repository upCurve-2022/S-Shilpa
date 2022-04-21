package Assignment_Level_1;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int x=1;
        for(int i=1;i<n;i++){
            x+=(i-1)*(i-1);
            if(i%2==0)
                System.out.print("-"+x+" ");
            else
                System.out.print(x+" ");
        }
    }
}
