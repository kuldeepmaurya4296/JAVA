package loops;

import java.util.Scanner;

public class problem_26 {
    //Take a number, as input and print its table
    //       5 * 1 = 5
    //       5 * 2 = 10 ... up to 10 terms

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) System.out.println(n+" * "+ i + " = "+ (n*i));
    }
}
