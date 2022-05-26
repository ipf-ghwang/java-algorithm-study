import java.util.Scanner;
import java.util.ArrayList;
  
public class Main {

    public static int[] solution(String s, char c) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = 100;
        }

        ArrayList<Integer> charIndex = new ArrayList<>();

        int idx = 0;

        while (idx < s.length()) {
            idx = s.indexOf(c, idx);

            if (idx >= 0) charIndex.add(idx);
            else break;

            idx++;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int ci : charIndex) {
                int distance = Math.abs(i - ci);

                answer[i] = Math.min(distance, answer[i]);

                if (distance == 0) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c = in.next().charAt(0);

        for (int i : solution(s, c)) {
            System.out.print(i + " ");
        }
    }
}