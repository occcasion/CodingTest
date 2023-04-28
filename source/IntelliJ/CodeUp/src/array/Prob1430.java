package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//시간 초과
public class Prob1430 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<n; ++i) {
            numbers.add(scanner.nextInt());
        }
        int m = scanner.nextInt();
        int[] question = new int[m];
        for (int i=0; i<m; ++i) {
            question[i] = scanner.nextInt();
        }
        for (int i=0; i<m; ++i) {
            if (numbers.contains(question[i])) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
