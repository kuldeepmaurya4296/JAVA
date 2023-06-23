package pattern;

public class problem_52 {
    //52- V - Min Height = 3
    //	*       *
    //	 *     *
    //	  *   *
    //	   * *
    //	    *

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
//                System.out.print("* ");
                if (i==j) System.out.print("* ");
                else System.out.print(" ");
            }
            for (int j = 1; j < n; j++) {
                if (n-i == j)
                System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
