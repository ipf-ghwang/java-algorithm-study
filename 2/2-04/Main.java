import java.util.Scanner;
  
public class Main {

    public static int[] solution(int n) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                answer[i] = 1;
            } else {
                answer[i] = answer[i - 2] + answer[i - 1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i : solution(n)) {
            System.out.print(i + " ");
        }
    }
}