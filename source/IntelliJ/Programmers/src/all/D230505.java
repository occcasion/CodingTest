package all;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class D230505 {

    // x만큼 간격이 있는 n개의 숫자
    public long[] solution(int x, int n) {
        return LongStream.rangeClosed(1, n).map(num -> num*x).toArray();
    }

    // 나머지가 1이 되는 수 찾기
    public int solution2(int n) {
        return IntStream.rangeClosed(3, 1000000).filter(num -> n%num==1).findFirst().getAsInt();
    }

    // 자릿수 더하기
    public int solution1(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
