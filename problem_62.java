package Arrays;

public class problem_62 {
    //62- Linear Search an array - If element found print the index else -1
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,5,6,3,7,2};
        int ele = 2;
        int n=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
               n=i;
               break;
            }
        }
        System.out.println(n);
    }
}
