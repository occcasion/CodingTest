package all;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class D230511 {


    // 약수의 개수와 덧셈
    public int solution3(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; ++i) {
            if (countDiv(i)%2==0) sum += i;
            else sum -= i;
        }
        return sum;
    }

    public int countDiv(int num) {
        int count = 0;
        for (int i = 1; i <= num; ++i) {
            if (num%i==0) ++count;
        }
        return count;
    }

    // 문자열 내림차순으로 배치하기
    public String solution2(String s) {
        return Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }

    // 내적
    public int solution1(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; ++i) {
            answer += a[i]*b[i];
        }
        return answer;
    }
}
