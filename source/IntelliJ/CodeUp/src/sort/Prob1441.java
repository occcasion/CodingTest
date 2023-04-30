package sort;

import java.util.Scanner;

public class Prob1441 {
    public static void main(String[] args) {
        int[] a = new int[10001];
        int n = 0;
        int i = 0;
        int j = 0;
        int temp = 0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (i=1; i<=n; ++i) {
            a[i] = scanner.nextInt();
        }

        for (i=1; i<n; ++i) {
            //여기서부터
            for (j=n-1; j>0;--j)
            //여기까지
            {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (i = 1; i <= n; ++i) {
            System.out.println(a[i]);
        }
    }
}
