package if_else;

import java.util.Scanner;

public class problem_18 {
    // Accept three numbers and print the greatest among them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3 ) System.out.println(num1+ " is Greater number!");
        else if (num2 > num1 && num2 > num3 ) System.out.println(num1+ " is Greater number!");
        else if (num3 > num2 && num3 > num1) System.out.println(num3+ " is greater!");
        else System.out.println("Numbers are equal!");

    }
}
