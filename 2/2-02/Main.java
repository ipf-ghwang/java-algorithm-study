import java.util.Scanner;
  
public class Main {

    public static int solution(int n, int[] height) {
        int inSight = 0;

        int maxHeight = 0;

        for (int h : height) {
            if (h > maxHeight) {
                inSight++;
                maxHeight = h;
            }
        }

        return inSight;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = in.nextInt();
        }

        System.out.println(solution(n, height));
    }
}