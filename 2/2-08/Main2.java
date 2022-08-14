import java.util.Scanner;
  
public class Main2 {

    public static int[] solution(int[] scores) {
        int[] answer = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            int targetScore = scores[i];
            int ranking = 1;

            for (int j = 0; j < scores.length; j++) {
                if (targetScore < scores[j]) {
                    ranking++;
                }
            }

            answer[i] = ranking;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] scores = new int[count];
        for (int i = 0; i < count; i++) {
            scores[i] = in.nextInt();
        }

        for (int i : solution(scores)) {
            System.out.print(i + " ");
        }
    }
}