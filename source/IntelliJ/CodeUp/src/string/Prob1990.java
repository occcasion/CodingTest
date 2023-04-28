package string;

import java.util.Scanner;

public class Prob1990 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int sum = 0;
        for (int i=0; i<n.length(); ++i) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        if (sum%3==0) System.out.println(1);
        else System.out.println(0);
    }
}
