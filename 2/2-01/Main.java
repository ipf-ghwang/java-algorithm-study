import java.util.Scanner;
import java.util.ArrayList;
  
public class Main {

    public static int[] solution(int n, int[] numbers) {
        ArrayList<Integer> answerList = new ArrayList<>();

        answerList.add(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) answerList.add(numbers[i]);
        }

        int[] answer = new int[answerList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }

        for (int i : solution(n, numbers)) {
            System.out.print(i + " ");
        }
    }
}