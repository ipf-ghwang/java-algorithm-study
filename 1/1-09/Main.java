import java.util.Scanner;
  
public class Main {

    public static int solution(String s) {
        String numbers = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) numbers += c;
        }

        return Integer.parseInt(numbers);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}