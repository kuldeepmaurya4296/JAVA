package if_else;

import java.util.Scanner;

public class problem_22 {
    //- Accept an english alphabet from user and check if it is a consonant or a vowel;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter english Alphabet: ");
        char alphabet = sc.nextLine().charAt(0);
        if (alphabet == 'a' ||alphabet == 'A' ||alphabet == 'e' ||alphabet == 'E' ||alphabet == 'i'
                ||alphabet == 'I' ||alphabet == 'o' ||alphabet == 'O' ||alphabet == 'u'
                ||alphabet == 'U') System.out.println(alphabet+ " is vowel!");
        else System.out.println(alphabet+" is consonant!");
    }
}
