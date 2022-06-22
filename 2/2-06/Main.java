import java.util.Scanner;
import java.util.ArrayList;
  
public class Main {

    public static int[] solution(int count, int[] numbers) {
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(StringUtil.reverse(String.valueOf(numbers[i])));
        }

        int maxNum = 0;

        for (int n : numbers) {
            if (n > maxNum) maxNum = n;
        }

        PrimeChecker primeChecker = new PrimeChecker(maxNum);

        ArrayList<Integer> primeArray = new ArrayList<Integer>();

        for (int n : numbers) {
            if (primeChecker.isPrime(n)) {
                primeArray.add(n);
            }
        }

        int[] answer = new int[primeArray.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = primeArray.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }
        
        for (int i : solution(count, numbers)) {
            System.out.print(i + " ");
        }
    }
}

class StringUtil {
    public static String reverse(String s) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }

        return new String(charArray);
    }
}

class PrimeChecker {
    private int maxNum;
    private boolean[] primeTable;

    public PrimeChecker(int maxNum) {
        this.maxNum = maxNum;
        this.primeTable = new boolean[maxNum + 1];
        initialize();
    }

    private void initialize() {
        for (int i = 2; i <= maxNum; i++) {
            primeTable[i] = true;
        }

        for (int i = 2; i * 2 <= maxNum; i++) {
            primeTable[i * 2] = false;
        }

        for (int i = 3; i <= maxNum; i++) {
            if (primeTable[i]) {
                for (int k = 2; k * i <= maxNum; k++) {
                    primeTable[k * i] = false;
                }
            }
        }
    }

    public boolean isPrime(int n) {
        return primeTable[n];
    }
}