package if_else;

import java.util.Scanner;

public class problem_12 {
    public static void main(String[] args) {
        //12- Accept two numbers and print the greatest between them

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = 6;
        System.out.print("Enter second number: ");
        int second = 74;
        if (first > second) System.out.println("first number is greater => "+first);
        else System.out.println("second number is greater => "+second);

        System.out.println(first < second ? first : second);
    }
}
