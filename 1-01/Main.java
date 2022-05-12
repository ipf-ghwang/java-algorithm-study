import java.util.Scanner;

public class Main {
    public static int solution(String str, char c) {
        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        char c = in.next().charAt(0);

        System.out.println(solution(str, c));
    }
}