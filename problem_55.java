package Arrays;

public class problem_55 {
    //Find the greatest element and print its index too.
    //      {2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index

    public static void main(String[] args) {
        int arr[] = {2, 96, 69, 77, 145, 20};
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
                index=i;
            }
        }
        System.out.println("Max element = "+max+" found at "+index+" index");
    }
}
