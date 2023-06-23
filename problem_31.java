package loops;

import java.util.Scanner;

public class problem_31 {
    // Print the sum of all factors of a number, 50 -> 1 + 2 + 5 + 10 + 25 = 43
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print(n+" -> ");
        for (int i = 1; i<n; i++ ){
            if (n%i==0) {
                System.out.print(i);
                if (i < (n / 2)) System.out.print(" + ");
                else System.out.print(" = ");
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
