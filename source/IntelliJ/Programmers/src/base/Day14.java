package base;

import java.util.ArrayList;
import java.util.List;

public class Day14 {

    //수열과 구간 쿼리 1
    public int[] solution5(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; ++i) {
            for (int j = queries[i][0]; j <= queries[i][1]; ++j) {
                ++arr[j];
            }
        }
        return arr;
    }

    //n보다 더 커질 때까지 더하기
    public int solution4(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; ++i) {
            answer += numbers[i];
            if (answer > n) return answer;
        }
        return answer;
    }

    //할 일 목록
    public String[] solution3(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();

        for (int i=0; i<todo_list.length; ++i) {
            if (!finished[i]) list.add(todo_list[i]);
        }

        return list.toArray(new String[list.size()]);
    }

    //5명씩
    public String[] solution2(String[] names) {
        int num = 0;
        if (names.length%5 != 0) num = 1;
        String[] arr = new String[names.length/5 + num];

        int count = 0;
        for (int i=0; i<names.length; ++i) {
            if (i%5==0) arr[count++] = names[i];
        }
        return arr;
    }

    //홀수 vs 짝수
    public int solution1(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i=0; i<num_list.length; ++i) {
            if (i%2==0) oddSum += num_list[i];
            else evenSum += num_list[i];
        }

        return oddSum>=evenSum ? oddSum : evenSum;
    }
}
