package String;

public class problem_75 {
    public static void main(String[] args) {
        String str = "fdojcoiwoeijvwaj";
        int con=0;
        int vov=0;
        for (char ch : str.toLowerCase().toCharArray()) {
            switch (ch){
                case 'a','e','i','o','u' -> vov++;
                default -> con++;
            }

        }
        System.out.println("vowel: "+vov+"\nconsonent: "+con);
    }
}
