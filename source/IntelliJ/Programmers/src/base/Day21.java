package base;

import java.util.*;

public class Day21 {

    // 전국 대회 선발 고사
    public int solution2(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> students = new HashMap<>();
        for (int i = 0; i < attendance.length; ++i) {
            if (attendance[i]) students.put(i, rank[i]);
        }
        int count = 0;
        int i = 0;
        int[] answer = new int[3];
        while (count < 3) {
            if (students.get(i) != null) answer[count++] = students.get(i++);
            else ++i;
        }
        return answer[0] * 10000 + answer[1] * 100 + answer[2];
    }
}
