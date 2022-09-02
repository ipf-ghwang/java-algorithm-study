import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int[] solution(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        List<Integer> list = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while (index1 < arr1.length && index2 < arr2.length) {
            if (arr1[index1] == arr2[index2]) {
                list.add(arr1[index1]);
                index1++;
                index2++;
            } else if (arr1[index1] < arr2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }

        while (index1 < arr1.length) {
            if (arr1[index1] == arr2[arr2.length - 1]) {
                list.add(arr1[index1]);
                break;
            } else if (arr1[index1] > arr2[arr2.length - 1]) {
                break;
            } else {
                index1++;
            }
        }
        
        while (index2 < arr2.length) {
            if (arr1[arr1.length - 1] == arr2[index2]) {
                list.add(arr2[index2]);
                break;
            } else if (arr1[arr1.length - 1] < arr2[index2]) {
                break;
            } else {
                index2++;
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
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