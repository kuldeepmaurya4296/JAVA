package Arrays;


public class problem_56 {
    //Find the second-greatest element
    //{2, 96, 69, 77, 145, 20} = Second greatest element = 96

    public static void main(String[] args) {
        int arr[] = {2, 96, 69, 77, 145, 20};
        int max = arr[0];//2
        int smax = arr[1];//96
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]<arr[i+1]) {
                if (max<smax) smax = max;
            }
            else if (arr[i]>arr[i+1]) {
                if (max>smax) smax = max;
            }

        }
        System.out.println(smax);
        System.out.println(max);
    }
}
