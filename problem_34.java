package loops;

import java.util.Scanner;

public class problem_34 {
    // Separate each digit of a number and print it on the new line ex - 123
    //	OP  3
    //		2
    //		1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n;) {
            System.out.println(n%10);
            n=n/10;
        }
    }
}
