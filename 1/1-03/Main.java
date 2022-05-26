import java.util.Scanner;
  
public class Main {

    public static String solution(String s) {
        String answer = "";

        for (String word : s.split(" ")) {
            if (answer.length() < word.length()) {
                answer = word;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solution(s));
        return ;
    }
}