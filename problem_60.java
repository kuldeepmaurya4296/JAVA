package Arrays;

import java.util.Arrays;

public class problem_60 {
    //60- Array left rotation by K elements
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 31;
        k = k % arr.length;
        for (int j = 1; j <= k; j++) {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
