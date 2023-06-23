package loops;

import java.util.Scanner;

public class problem_39 {
    //Automorphism number 5 = 25 = 625 = 390625, 6=36, 76 = 5776
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 3; i++) {
            int automorphism = num*num;
            System.out.println(automorphism);
            num=num*num;
        }
    }
}
