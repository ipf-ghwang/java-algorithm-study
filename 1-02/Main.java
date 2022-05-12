import java.util.Scanner;
  
public class Main {

    public static String solution(String s) {
        char[] answer = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) {
                answer[i] = Character.toLowerCase(c);
            } else {
                answer[i] = Character.toUpperCase(c);
            }
        }

        return new String(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
        return ;
    }
}