package array;

import java.util.Scanner;

public class Prob1515 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[27][27];
        for (int i=1; i<=25; ++i) {
            for (int j=1; j<=25; ++j) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i=1; i<=25; ++i) {
            for (int j=1; j<=25; ++j) {
                int sum = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i][j-1] + arr[i][j+1] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                if (arr[i][j]==0) {
                    if (sum==3) arr[i][j] = 1;
                } else {
                    if (sum>=4 || sum<=1) arr[i][j] = 0;
                    else arr[i][j] = 1;
                }
            }
        }

        for (int i=1; i<=25; ++i) {
            for (int j=1; j<=25; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
