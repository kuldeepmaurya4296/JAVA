package Arrays;

import java.util.Arrays;

public class problem_61 {
    //61- Array Reverse Without Using Extra space
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i=0,j= arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
