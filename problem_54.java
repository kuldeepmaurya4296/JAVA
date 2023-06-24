package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class problem_54 {
    //Accept size n from user and create a n size array then take n inputs into the and finally
    //      Print the sum & Mean of all elements.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
//            System.out.print(arr[i]+" ");
        }
        System.out.println("mean: "+sum/n);
        System.out.println("sum: "+sum);

    }
}
