package loopcomplex;

import java.util.Scanner;

//잘못된 풀이
public class Prob1369 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i=0; i<n; ++i) {
            for (int j=0; j<n; ++j) {
                if (i==0 || i==(n-1) || j==0 || j==(n-1)) System.out.print("*");
                else if (k==1) System.out.print("*");
                else if ((j+i)%k == (k-n%k)) System.out.print("*");
//                else if (((i%k)+(j%k)%k==2)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
