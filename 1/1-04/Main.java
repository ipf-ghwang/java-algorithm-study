import java.util.Scanner;
  
public class Main {

    public static String[] solution(String[] strs) {
        String[] answer = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            answer[i] = new StringBuilder(strs[i]).reverse().toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        String[] strs = new String[count];

        for (int i = 0; i < count; i++) {
            strs[i] = in.next();
        }

        for (String s : solution(strs)) {
            System.out.println(s);
        }

        return ;
    }
}