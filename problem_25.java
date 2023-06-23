package loops;

import java.util.Scanner;

public class problem_25 {
    //Reverse for loop. Print n to 1.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
