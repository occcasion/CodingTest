package loopcomplex;

import java.util.Scanner;

public class Prob1368 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int k = scanner.nextInt();
        String d = scanner.next();

        for (int i=0; i<h; ++i) {
            if (d.equals("L")) {
                for (int n=0; n<i; ++n) {
                    System.out.print(" ");
                }
            } else if (d.equals("R")) {
                for (int n=0; n<h-i-1; ++n) {
                    System.out.print(" ");
                }
            }
            for (int j=0; j<k; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
