package loops;

import java.util.Scanner;

public class problem_37 {
    //Accept a number and check if it is a palindromic number (If number and its reverse are equal)
    //       Ex - 12321 - Reverse - 12321

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int temp=num,rem,sum=0;
        for (int i = 0; i < num; ) {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if (temp==sum) System.out.println("It is Palindromic!");
        else System.out.println("It is not Palindromic!");
    }
}
