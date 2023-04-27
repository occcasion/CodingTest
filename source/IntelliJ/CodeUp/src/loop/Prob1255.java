package loop;

import java.util.Scanner;

public class Prob1255 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        for (double i=a; i<=b; i+=0.01) {
            System.out.printf("%.2f ", i);
        }
    }
}
