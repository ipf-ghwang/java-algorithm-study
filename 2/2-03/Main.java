import java.util.Scanner;
  
public class Main {

    public static String[] solution(int round, int[] playerA, int[] playerB) {
        String[] answer = new String[round];

        for (int i = 0; i < round; i++) {
            if (playerA[i] == playerB[i]) {
                answer[i] = "D";
            } else if (playerA[i] - playerB[i] == 1 || playerA[i] - playerB[i] == -2) {
                answer[i] = "A";
            } else {
                answer[i] = "B";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int round = in.nextInt();

        int[] playerA = new int[round];
        for (int i = 0; i < round; i++) {
            playerA[i] = in.nextInt();
        }

        int[] playerB = new int[round];
        for (int i = 0; i < round; i++) {
            playerB[i] = in.nextInt();
        }

        for (String s : solution(round, playerA, playerB)) {
            System.out.println(s);
        }
    }
}