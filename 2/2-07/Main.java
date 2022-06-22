import java.util.Scanner;
  
public class Main {

    public static int solution(int count, int[] answers) {
        int totalScore = 0;
        int correctChain = 0;

        for (int answer : answers) {
            if (answer == 1) {
                correctChain++;
                totalScore += correctChain;
            } else {
                correctChain = 0;
            }
        }

        return totalScore;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        
        int[] answers = new int[count];
        for (int i = 0; i < count; i++) {
            answers[i] = in.nextInt();
        }
        
        System.out.println(solution(count, answers));
    }
}