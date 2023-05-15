package all;

import java.util.Arrays;
import java.util.stream.Collectors;

public class D230516 {

    // 예산
    public int solution3(int[] d, int budget) {
        int sum = budget;
        int[] arr = Arrays.stream(d).sorted().toArray();
        for (int i=0; i<arr.length; ++i) {
            if (sum - arr[i] >= 0) sum -= arr[i];
            else return i;
        }
        return arr.length;
    }

    // 숫자의 표현
    public int solution2(int n) {
        int answer = 1;

        if (n==1 || n==2 || n==4) return 1;
        if (n==3) return 2;

        for (int i=2; i<n/2; ++i) {

        }

        return answer;
    }

    // 이상한 문자 만들기
    public String solution1(String s) {
        String answer = "";

        int index = 1;
        for (int i=0; i<s.length(); ++i) {
            if (s.charAt(i)==' ') {
                answer += " ";
                index = 1;
                continue;
            }
            if (index%2==1) {
                answer += Character.toString(s.charAt(i)).toUpperCase();
                ++index;
            }
            else {
                answer += Character.toString(s.charAt(i)).toLowerCase();
                ++index;
            }
        }
        return answer;
    }
}
