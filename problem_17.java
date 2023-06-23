package if_else;

import java.util.Scanner;

public class problem_17 {
    //Accept a day number between 1-7 and print the corresponding day name.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between 1-7 :  ");
        int dayNumber = sc.nextInt();
        if (dayNumber == 1) System.out.print("It is Sunday today!");
        else if (dayNumber == 2) System.out.print("It is Monday today!");
        else if (dayNumber == 3) System.out.print("It is Tuesday today!");
        else if (dayNumber == 4) System.out.print("It is Wednesday today!");
        else if (dayNumber == 5) System.out.print("It is Thursday today!");
        else if (dayNumber == 6) System.out.print("It is Friday today!");
        else if (dayNumber == 7) System.out.print("It is Saturday today!");
        else System.out.println("Invalid Input!");
    }
}
