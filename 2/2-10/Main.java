import java.util.Scanner;
  
public class Main {
    public static int solution(int size, int[][] map) {
        int peakCount = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isPeak(map, i, j)) peakCount++; 
            }
        }

        return peakCount;
    }

    public static boolean isPeak(int[][] map, int i, int j) {
        // 상단 확인
        if (i > 0 && map[i - 1][j] >= map[i][j]) return false;

        // 좌측 확인
        if (j > 0 && map[i][j - 1] >= map[i][j]) return false;

        // 하단 확인
        if (i < map.length - 1 && map[i + 1][j] >= map[i][j]) return false;

        // 우측 확인
        if (j < map[i].length - 1 && map[i][j + 1] >= map[i][j]) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[][] map = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(size, map));
    }
}