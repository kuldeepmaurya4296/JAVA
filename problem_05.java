import java.util.Scanner;

public class problem_05 {
    //Accept the User's name, age and print in following manner
    //	Ex - Hello Shery, you are 12 years old.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.println("Hello "+name+", you are "+age+" years old.");
    }
}
C:\Users\ABC\IdeaProjects\