package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Prob1452 {

    //퀵정렬 / O(nlog₂n)의 시간 복잡도 / O(log n)만큼의 메모리
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }
        quickSort(arr);

        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr) {
        //피벗
        int len = arr.length;
        int p = arr[len-1];
        int i = 0;
        int j = len - 2;
        for (i=0; i<len-2; ++i) {
            if (i >= j) { //i가 j보다 커지면 (즉, 값 교환이 끝나면) 피벗과 교환하고 끝낸다.
                int temp = arr[i];
                arr[i] = p;
                arr[len-1] = temp;
                break;
            }
            if (p < arr[i] && arr[j] < p) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                --j;
            } else if (p < arr[i] && p < arr[j]) {
                --i;
                --j;
            } else if (arr[i] < p && arr[j] < p) {

            } else if (arr[i] < p && p < arr[j]) {
                --j;
            }
        }

        if (i > 0) quickSort(Arrays.copyOfRange(arr, 0, i));
        if (i+1 < len) quickSort(Arrays.copyOfRange(arr, i+1, len));
    }
}
