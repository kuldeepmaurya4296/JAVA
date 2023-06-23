package loops;

import java.util.Scanner;

public class problem_33 {
    //Write a program to take two inputs a, b & find the value of a  raised to the power of b.
    //	Ex - a = 2, b = 5
    //	OP - 2^5 = 32

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int power = 1;
        for (int i = 1; i <= num2; i++) {
            power*=num1;
        }
        System.out.println(num1+"^"+num2+" = "+power);
    }
}
