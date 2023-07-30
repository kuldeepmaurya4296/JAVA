package String;

public class problem_76 {
    public static void main(String[] args) {
        String str = "KulDeEp";
        String ans = "";
        for (char ch : str.toCharArray()) {
            if(ch >= 'A' && ch <= 'Z'){
                ans+= (char) (ch + 32);
            }
            else ans+= (char) (ch - 32);
        }
        System.out.println(ans);
    }
}
