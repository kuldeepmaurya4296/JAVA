package if_else;

import java.util.Scanner;

public class problem_13  /*problem_14*/ {
    // Accept the gender from the user as char and print the respective greeting message
    //      Ex - Good Morning Sir (on the basis of gender)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender: ");
        char gender = sc.next().charAt(0);
        if(gender == 'm' || gender == 'M') System.out.println("Good morning Sir! ");
        else if (gender == 'f' || gender== 'F') System.out.println("Good morning Mam! ");
        else System.out.println("Invalid Input");
    }
}
