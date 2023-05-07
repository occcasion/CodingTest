package all;

import java.util.Arrays;
import java.util.Comparator;

public class D230508 {

    // 하샤드 수
    public boolean solution3(int x) {
        int y = Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum();
        return x%y==0;
    }

    // 정수 내림차순으로 배치하기
    public long solution2(long n) {
        String[] arr = String.valueOf(n).split("");
        long[] sortedArr = Arrays.stream(arr).sorted(Comparator.reverseOrder()).mapToLong(Long::valueOf).toArray();
        long sum = 0;
        for (int i = 0; i < sortedArr.length; ++i) {
            sum = sum * 10 + sortedArr[i];
        }
        return sum;
    }

    // 문자열을 정수로 바꾸기
    public int solution1(String s) {
        if (s.charAt(0)=='+') return Integer.parseInt(s.substring(1));
        else if (s.charAt(0)=='-') return -Integer.parseInt(s.substring(1));
        else return Integer.parseInt(s);
    }
}
