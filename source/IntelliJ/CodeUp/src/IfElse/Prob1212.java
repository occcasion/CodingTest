package IfElse;

import java.util.Arrays;
import java.util.Scanner;

public class Prob1212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[3];
        num[0] = scanner.nextInt();
        num[1] = scanner.nextInt();
        num[2] = scanner.nextInt();
        Arrays.sort(num);

        if (num[2] < num[0]+num[1]) System.out.println("yes");
        else System.out.println("no");
    }
}
