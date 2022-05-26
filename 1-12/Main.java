import java.util.Scanner;
  
public class Main {
    private static final int CODE_SIZE = 7;

    private static char decodeToChar(String code) {
        int result = 0;

        for (int i = 0; i < CODE_SIZE; i++) {
            if (code.charAt(CODE_SIZE - i - 1) == '#') {
                result += Math.pow(2, i);
            }
        }

        return (char) result;
    }

    public static String solution(int n, String s) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String code = s.substring(CODE_SIZE * i, CODE_SIZE * (i + 1));

            answer += decodeToChar(code);            
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        System.out.println(solution(n, s));
    }
}