package sort;

import java.util.*;

public class Prob3004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            int num = scanner.nextInt();
            list.add(num);
            sortedList.add(num);
        }
        Collections.sort(sortedList);

        for (int i = 0; i < n; ++i) {
            list.set(list.indexOf(sortedList.get(i)), i);
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(list.get(i) + " ");
        }
    }
}
