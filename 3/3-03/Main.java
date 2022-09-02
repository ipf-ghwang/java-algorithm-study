import java.util.Scanner;

public class Main {
    public static int solution(int[] arr, int K) {
        int sum = 0;
        // K일 동안의 매출액 합계 초기값 구하기
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }

        int answer = sum;
        int headIndex = 0;
        for (int i = K; i < arr.length; i++) {
            /**
             * arr[headIndex + 1] ~ arr[i] 까지의 합이므로
             * arr[i]는 더해주고 arr[headIndex]는 빼주면 새로운 K일 동안의 합계를 구할 수 있다.
             */
            sum += arr[i] - arr[headIndex];

            if (answer < sum) {
                answer = sum;
            }

            headIndex++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr, K));
    }
}