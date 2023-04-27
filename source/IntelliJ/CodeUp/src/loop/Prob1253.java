package loop;

import java.util.Scanner;

public class Prob1253 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        for (int i=min; i<=max; ++i) {
            System.out.print(i + " ");
        }
    }
}
