package loops;

import java.util.Scanner;

public class problem_32 {
    // Check if the number is Prime or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int temp=0;
        for (int i = 2; i<n; i++){
           if (n%i==0) temp++;
        }
        if (temp > 0) System.out.println(n+" is not prime number");
        else System.out.println(n+" is prime number");
    }
}
