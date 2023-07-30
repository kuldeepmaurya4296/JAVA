package String;

public class problem_77 {
    public static void main(String[] args) {
        String str[] = {"pay","attention","practice","attend"};
        String pre = "at";
        int ans=0;
        for(String word : str){
            if(word.startsWith(pre))ans++;
        }
        System.out.println(ans);
    }
}
