import java.util.Scanner;
  
public class Main {
    public static int solution(int[][] board) {
        int maxSum = 0;
        
        // 행의 합, 열의 합
        for (int i = 0; i < board.length; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < board[0].length; j++) {
                rowSum += board[i][j];
                colSum += board[j][i];
            }

            maxSum = Math.max(maxSum, rowSum);
            maxSum = Math.max(maxSum, colSum);
        }

        // 대각선의 합
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for (int i = 0; i < board.length; i++) {
            diagonalSum1 += board[i][i];
            diagonalSum2 += board[i][board[0].length - 1 - i];
        }

        maxSum = Math.max(maxSum, diagonalSum1);
        maxSum = Math.max(maxSum, diagonalSum2);

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[][] board = new int[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                board[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(board));
    }
}