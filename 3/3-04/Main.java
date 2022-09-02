import java.util.Scanner;

public class Main {
    public static int solution(int[] arr, int M) {
        int answer = 0;
        Window window = new Window(arr);

        while (window.isIndexValid()) {
            if (window.getSum() == M) {
                answer++;
                window.slide();
            } else if (window.getSum() < M) {
                window.expandRight();
            } else {
                window.shrinkLeft();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr, M));
    }
}

class Window {
    private int[] arr;
    private int leftIndex = 0;
    private int rightIndex = 0;
    private int sum;

    public Window(int[] arr) {
        this.arr = arr;
        this.sum = arr[0];
    }

    public int getSum() {
        return sum;
    }

    public boolean isIndexValid() {
        return leftIndex < arr.length && rightIndex < arr.length;
    }

    public void slide() {
        if (isExpandable()) {
            sum += arr[rightIndex + 1] - arr[leftIndex];
        }

        leftIndex++;
        rightIndex++;
    }

    public void expandRight() {
        if (isExpandable()) {
            sum += arr[rightIndex + 1];
        }

        rightIndex++;
    }

    public void shrinkLeft() {
        if (leftIndex == rightIndex) {
            if (isExpandable()) {
                sum = arr[leftIndex + 1];
            }

            leftIndex++;
            rightIndex++;
        } else {
            sum -= arr[leftIndex];
            leftIndex++;
        }
    }

    private boolean isExpandable() {
        return rightIndex + 1 < arr.length;
    }
}