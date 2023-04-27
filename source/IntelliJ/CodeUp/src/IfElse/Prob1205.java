package IfElse;

import java.util.Arrays;
import java.util.Scanner;

public class Prob1205 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double[] results = new double[6];
        results[0] = a+b; //sum
        results[1] = Math.abs(a-b); //sub
        results[2] = a/b; //div1
        results[3] = b/a; //div2
        results[4] = Math.pow(a, b); //sqrt1
        results[5] = Math.pow(b, a); //sqrt2
        Arrays.sort(results);

        System.out.printf("%.6f", results[results.length-1]);
    }
}
