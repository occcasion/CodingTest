package array;

import java.util.Scanner;

public class Prob1416 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = "";
        if (n==0) {
            System.out.println(0);
            return;
        }
        while (n>0) {
            str = Integer.toString(n%2) + str;
            n /= 2;
        }
        System.out.println(str);
    }
}
