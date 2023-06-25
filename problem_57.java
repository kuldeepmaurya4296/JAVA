package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class problem_57 {
    //Check if array is sorted in increasing order or not.
    //       Ex 1 - { 1, 5, 8,  9, 10, 15 } - OP = "YES"
    //       Ex 2 - { 1, 8, 6, 9, 10, 15 } - OP = "NO"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);


    }
}
