import java.util.Scanner;
  
public class Main {

    public static String solution(String s) {
        String answer = "";

        int count = 1;
        char latestChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == latestChar) {
                count++;
            } else {
                answer += latestChar;
                latestChar = s.charAt(i);
                
                if (count > 1) {
                    answer += count;
                    count = 1;
                }
            }
        }

        answer += latestChar;
        if (count > 1) {
            answer += count;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}