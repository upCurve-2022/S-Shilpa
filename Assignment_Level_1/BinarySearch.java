package Assignment_Level_1;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++)
            Arr[i] = sc.nextInt();
        System.out.print("Enter element to be searched: ");
        int item = sc.nextInt();
        boolean flag = false;
        int low=0, high=n-1, mid=n/2;
        while(low<high) {
            int d=Arr[mid];
            if (item > d)
                low = mid + 1;
            else if (item < d)
                high = mid- 1;
            else{
                flag = true;
                break;
            }
            mid=(high+low)/2;
        }
        if (flag)
            System.out.print("Element found");
        else
            System.out.print("Element not found");
    }
}
