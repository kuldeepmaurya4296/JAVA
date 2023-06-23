package if_else;

import java.util.Scanner;

public class problem_19 {
    //Accept a year and check if it's a leap year or not (google to find out what's a leap year)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        if (year%4 == 0 && year%100 != 0) System.out.println(year+" is a leap year!");
        else if (year%400 == 0) System.out.println(year+" is a leap year!");
        else System.out.println(year+" is not a leap year!");
    }
}
