package IfElse;

import java.util.Scanner;

public class Prob1165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int score = scanner.nextInt();

        while (time <90) {
            ++score;
            time += 5;
        }

        System.out.println(score);
    }
}
