package loops;

import java.util.Scanner;

public class problem_35 {
    // Sum of digits of a number, 936 = 18

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int sum=0;
        System.out.print("Sum of all digits of  number "+n);
        for (int i = 1; i<=n;){
            sum+=(n%10);
            n=n/10;
        }
        System.out.println(" = "+sum);
    }
}
