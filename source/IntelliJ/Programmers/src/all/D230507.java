package all;

import java.util.Arrays;

public class D230507 {

    // 자연수 뒤집어 배열로 만들기
    public int[] solution3(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        return Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();
    }

    // 정수 제곱근 판별
    public long solution2(long n) {
        for (long i = 1; i <= Math.sqrt(n); ++i) {
            if (i * i == n) return (i + 1) * (i + 1);
        }
        return -1;
    }
    
    // 문자열 내 p와 y의 개수
    boolean solution1(String s) {
        long p = s.chars().filter(c -> c=='p' || c=='P').count();
        long y = s.chars().filter(c -> c=='y' || c=='Y').count();

        return p==y;
    }
}
