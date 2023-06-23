package loops;

import java.util.Scanner;

public class problem_38 {
    // Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
    //       Ex- 145 = 1! + 4! + 5! = 145

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:  ");
        int num = sc.nextInt();
        int temp = num,rem,sum=0;
        for (int i = 1; i <= num; ) {
            rem=num%10; //rem 5
            int fact = 1;
            if (rem==0) fact = 0;
            else {
                for (int j = 1; j <= rem; j++) {
                    fact *= j;
                }
            }
            sum += fact;

            num=num/10; //14

        }

        System.out.print(sum+"  --  "+temp);
    }
}
