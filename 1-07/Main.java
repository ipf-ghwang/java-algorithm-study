import java.util.Scanner;
  
public class Main {

    public static String solution(String s) {
        s = s.toLowerCase();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
        return ;
    }
}