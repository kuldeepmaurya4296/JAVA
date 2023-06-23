package if_else;

import java.util.Scanner;

public class problem_16 {
    // Accept name and age from the user. Check if the user is a valid voter or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey! sherry enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) System.out.println("Sherry, You are a valid voter");
        else System.out.println("Sorry Sherry, you can't cast the vote.");

        //Part 2 - Print after how many years the user will be eligible
        if (age < 18 ) System.out.println("Sherry your are valid voter after "+(18-age)+" years");

    }
}
