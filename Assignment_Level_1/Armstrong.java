package Assignment_Level_1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int sum=0,m=n;
        while(m>0){
            int d = m%10;
            sum += d*d*d;
            m/=10;
        }
        if(n == sum)
            System.out.println(n + " is an Armstrong Number");
        else
            System.out.println(n + " is not an Armstrong Number");
    }
}
