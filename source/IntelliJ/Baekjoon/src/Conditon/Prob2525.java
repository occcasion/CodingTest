package Conditon;

import java.util.Scanner;

public class Prob2525 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nowHour = scanner.nextInt();
        int nowMin = scanner.nextInt();
        int min = scanner.nextInt();

        nowMin += min;
        nowHour += nowMin/60;
        if (nowMin >= 60) {
            if (nowHour > 23) System.out.println((nowHour - 24) + " " + (nowMin%60));
            else System.out.println(nowHour + " " + (nowMin%60));
        } else {
            System.out.println(nowHour + " " + nowMin);
        }
    }
}
