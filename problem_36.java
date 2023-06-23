package loops;

import java.util.Scanner;

public class problem_36 {
    // Accept a number and print its reverse
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.print(n+" reverse number is: ");
        for (int i = 1; i <= n; ) {
            System.out.print(n%10);
            n=n/10;
        }
    }
}
