package IfElse;

import java.util.Scanner;

public class Prob1173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        if (min >= 30) {
            System.out.println(hour + " " + (min-30));
        } else {
            if (hour >=1) System.out.println((hour-1) + " " + (min+30));
            else System.out.println("23 " + (min+30));
        }
    }
}
