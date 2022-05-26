import java.util.Scanner;
  
public class Main2 {
    private static final int CODE_SIZE = 7;

    public static String solution(int n, String s) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String code = s.substring(CODE_SIZE * i, CODE_SIZE * (i + 1))
                            .replace("#", "1")
                            .replace("*", "0");
            
            answer += (char) Integer.parseInt(code, 2);
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