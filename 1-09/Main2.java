import java.util.Scanner;
  
public class Main2 {

    public static int solution(String s) {
        return Integer.parseInt(s.replaceAll("[^0-9]", ""));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}