import java.util.Scanner;
import java.util.ArrayList;
  
public class Main2 {

    public static int[] solution(String s, char c) {
        int[] answer = new int[s.length()];

        int distance = 100;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                distance = 0;
            } else {
                distance += 1;
            }
            
            answer[i] = distance;
        }

        distance = 100;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                distance = 0;
            } else {
                distance += 1;
            }
            
            answer[i] = Math.min(distance, answer[i]);
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