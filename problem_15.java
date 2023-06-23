package if_else;

import java.util.Scanner;

public class problem_15 {
    // Accept an integer and check whether it is an even number or odd.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        if (number%2 == 0) System.out.println("Your number is even");
        else  System.out.println(number+" is odd number!");
    }
}
