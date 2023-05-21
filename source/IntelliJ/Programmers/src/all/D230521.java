package all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D230521 {

    public static void main(String[] args) {
//        System.out.println(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
        System.out.println(solution(new int[]{70, 50, 80}, 100));
    }

    // 구명보트
    public static int solution(int[] people, int limit) {
        List<Integer> checked = new ArrayList<>();
        people = Arrays.stream(people).sorted().toArray();
        int count = 0;
        for (int i=people.length-1; i>=0; --i) {
            if (checked.contains(i)) continue;
            checked.add(i);
            for (int j=0; j<people.length; ++j) {
                if (checked.contains(j)) continue;
                if (people[i]+people[j] <= limit) checked.add(j);
            }
            ++count;
        }
        return count;
    }

    // K번째 수
    public static int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i=0; i<commands.length; ++i) {
            int[] arr = Arrays.stream(Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1])).sorted().toArray();
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
//    public static int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//        for (int i=0; i<commands.length; ++i) {
//            String s = Arrays.stream(array).mapToObj(Integer::toString).collect(Collectors.joining());
//            if (commands[i][1] >= s.length()) s = s.substring(commands[i][0]-1);
//            else s = s.substring(commands[i][0]-1, commands[i][1]);
//            s = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
//            answer[i] = Character.getNumericValue(Arrays.stream(s.split("")).sorted().collect(Collectors.joining()).charAt(commands[i][2]-1));
//        }
//        return answer;
//    }

    // 문자열 내 마음대로 정렬하기
    public String[] solution1(String[] strings, int n) {
        String[] answer = {};
        return answer;
    }
}
