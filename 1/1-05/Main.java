import java.util.Scanner;
  
public class Main {

    public static String solution(String s) {
        char[] answer = s.toCharArray();
        int left = 0;
        int right = answer.length - 1;

        while(left < right) {
            if (!Character.isAlphabetic(answer[left])) {
                left++;
            } else if (!Character.isAlphabetic(answer[right])) {
                right--;
            } else {
                char tmp = answer[left];
                answer[left] = answer[right];
                answer[right] = tmp;
    
                left++;
                right--;
            }
        }

        return new String(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
        return ;
    }
}