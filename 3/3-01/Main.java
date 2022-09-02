import java.util.Scanner;

public class Main {

    public static int[] solution(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length + arr2.length];

        int indexAnswer = 0;
        int index1 = 0;
        int index2 = 0;
        while (index1 < arr1.length && index2 < arr2.length) {
            if (arr1[index1] <= arr2[index2]) {
                answer[indexAnswer] = arr1[index1];
                index1++;
            } else {
                answer[indexAnswer] = arr2[index2];
                index2++;
            }

            indexAnswer++;
        }

        while (index1 < arr1.length) {
            answer[indexAnswer] = arr1[index1];
            indexAnswer++;
            index1++;
        }

        while (index2 < arr2.length) {
            answer[indexAnswer] = arr2[index2];
            indexAnswer++;
            index2++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size1 = in.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = in.nextInt();
        }

        int size2 = in.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = in.nextInt();
        }

        for (int n : solution(arr1, arr2)) {
            System.out.print(n + " ");
        }
    }
}