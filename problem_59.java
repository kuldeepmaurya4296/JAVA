package Arrays;

import java.util.Arrays;

public class problem_59 {
    //59- Array left Rotation by 1
    public static void main(String[] args) {
        int arr[] = {3,4,2,5,7,6};
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
