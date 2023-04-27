package loop;

import java.util.Scanner;

public class Prob1283 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int b = scanner.nextInt();
        int[] data = new int[b];
        for (int i=0; i<b; ++i) {
            data[i] = scanner.nextInt();
        }
        double result = a;
        for (int i=0; i<b; ++i) {
            result *= ((double)(100+data[i]) / (double)100);
        }
        int res = (int)Math.round(result) - (int)a;
        System.out.println(res);
        if (res>0) System.out.println("good");
        else if (res==0) System.out.println("same");
        else System.out.println("bad");
    }
}
