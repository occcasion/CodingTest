package IfElse;

import java.util.Arrays;
import java.util.Scanner;

public class Prob1218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[3];
        num[0] = scanner.nextInt();
        num[1] = scanner.nextInt();
        num[2] = scanner.nextInt();
        Arrays.sort(num);

        if (num[2] >= num[0]+num[1]) {
            System.out.println("삼각형아님");
        } else {
            if (num[0]==num[1] && num[1]==num[2]) System.out.println("정삼각형");
            else if (num[0]==num[1] || num[1]==num[2] || num[2]==num[0]) System.out.println("이등변삼각형");
            else if (num[0]*num[0] + num[1]*num[1] == num[2]*num[2]) System.out.println("직각삼각형");
            else System.out.println("삼각형");
        }
    }
}
