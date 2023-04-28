package string;

import java.util.Scanner;

public class Prob1754 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int lenA = a.length();
        int lenB = b.length();

        if (lenA > lenB) System.out.println(b + " " + a);
        else if (lenA < lenB) System.out.println(a + " " + b);
        else {
            for (int i=0; i<lenA; ++i) {
                if (a.charAt(i)==b.charAt(i)) continue;
                System.out.println((a.charAt(i)<b.charAt(i)?a:b) + " " + (a.charAt(i)<b.charAt(i)?b:a));
                return;
            }
        }
    }
}
