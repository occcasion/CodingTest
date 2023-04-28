package array;

import java.util.Arrays;
import java.util.Scanner;

public class Prob1425 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] heights = new int[n];
        for (int i=0; i<n; ++i) {
            heights[i] = scanner.nextInt();
        }

        Arrays.sort(heights);

        for (int i=0; i<n; ++i) {
            System.out.print(heights[i] + " ");
            if (i%c==c-1) System.out.println();
        }
    }
}
