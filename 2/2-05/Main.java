import java.util.Scanner;
  
public class Main {

    public static int solution(int n) {
        boolean[] primeArray = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            primeArray[i] = true;
        }

        for (int i = 2; i * 2 <= n; i++) {
            primeArray[i * 2] = false;
        }

        int primeCount = 1;

        for (int i = 3; i <= n; i++) {
            if (primeArray[i]) {
                primeCount++;
                for (int k = 2; k * i <= n; k++) {
                    primeArray[k * i] = false;
                }
            }
        }

        return primeCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }
}