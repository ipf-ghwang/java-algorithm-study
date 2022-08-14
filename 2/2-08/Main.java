import java.util.Scanner;
import java.util.Arrays;
  
public class Main {

    public static int[] solution(int count, int[] scores) {
        Score[] comparableScores = new Score[count];

        for (int i = 0; i < count; i++) {
            comparableScores[i] = new Score(i, scores[i]);
        }

        Arrays.sort(comparableScores);

        int ranking = 0;
        int previousScore = -1;
        int[] answer = new int[count];
        int sameScoreCount = 1;

        for (Score s : comparableScores) {
            if (s.getScore() == previousScore) {
                sameScoreCount++;
            } else {
                ranking += sameScoreCount;
                sameScoreCount = 1;
            }

            answer[s.getIndex()] = ranking;
            previousScore = s.getScore();
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

        for (int i : solution(count, scores)) {
            System.out.print(i + " ");
        }
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

    // 내림차순 정렬
    public int compareTo(Score other) {
        if (score > other.getScore()) {
            return -1;
        }

        return 1;
    }
}