package loops;

import java.util.Scanner;

public class problem_24 {
    //Print natural number up to n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
