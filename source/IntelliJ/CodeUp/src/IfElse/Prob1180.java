package IfElse;

import java.util.Scanner;

public class Prob1180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ten = n%10;
        int one = n/10;
        int zipped = (10 * ten + one) * 2;
        zipped = zipped%100;
        System.out.println(zipped);
        if (zipped <= 50) System.out.println("GOOD");
        else System.out.println("OH MY GOD");
    }
}
