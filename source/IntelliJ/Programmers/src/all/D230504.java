package all;

import java.util.Arrays;
import java.util.stream.IntStream;

public class D230504 {

    // 평균 구하기
    public double solution3(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }

    // 약수의 합
    public int solution2(int n) {
        return IntStream.rangeClosed(1, n).filter(num -> n%num==0).sum();
    }

    // 짝수와 홀수
    public String solution1(int num) {
        return num%2==0 ? "Even" : "Odd";
    }
}
