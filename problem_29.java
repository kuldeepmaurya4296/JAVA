package loops;

import java.util.Scanner;

public class problem_29 {
    //Print the sum of all even & odd numbers in a range separately.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                sum1+=i;
            }
            else sum2+=i;
        }
        System.out.println("The sum of all even number is: "+sum1+" & sum of odd number is: "+sum2);
    }
}
