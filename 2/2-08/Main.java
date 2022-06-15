import java.util.Scanner;
import java.util.Arrays;
  
public class Main {

    public static int[] solution(int count, int[] scores) {
        Score[] comparableScores = new Score[count];

        for (int i = 0; i < count; i++) {
            comparableScores[i] = new Score(i, scores[i]);
        }

        Arrays.sort(comparableScores);

        for (Score s : comparableScores) {
            System.out.println(s.getScore());
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        int[] scores = new int[count];
        for (int i = 0; i < count; i++) {
            scores[i] = in.nextInt();
        }

        System.out.println(solution(count, scores));
    }
}

class Score implements Comparable<Score> {
    private int index;
    private int score;

    public Score(int index, int score) {
        this.index = index;
        this.score = score;
    }

    public int getIndex() {
        return index;
    }

    public int getScore() {
        return score;
    }

    public int compareTo(Score other) {
        if (score > other.getScore()) {
            return 1;
        }

        return -1;
    }
}