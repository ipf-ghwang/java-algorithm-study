import java.util.Scanner;

public class Main {

    public static String solution(String s) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (i == s.indexOf(s.charAt(i))) {
                answer += s.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));

        return;
    }
}
