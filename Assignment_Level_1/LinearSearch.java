package Assignment_Level_1;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] Arr =new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++)
            Arr[i] = sc.nextInt();
        System.out.print("Enter element to be searched: ");
        int e = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (Arr[i] == e)
            {flag = true;
                break;
            }
        }
        if (flag)
            System.out.print("Element found");
        else
            System.out.print("Element not found");
    }
}
