package loop;

import java.util.Scanner;

public class Prob1284 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1; i<=n; ++i) {
            if (n%i==0 && isPrime(i) && isPrime(n/i) && i!=1 && (n/i)!=1) {
                System.out.println(i + " " + n/i);
                return;
            }
        }
        System.out.println("wrong number");
    }

    public static boolean isPrime(int num) {
        int count = 0;
        for (int i=1; i<=Math.sqrt(num); ++i) {
            if (num%i==0) ++count;
        }
        if (count==1) return true;
        return false;
    }
}
