package all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D230517 {

    public static void main(String[] args) {
//        System.out.println(solution(15));
//        System.out.println(solution(78));
    }

    // 피보나치 수
    public int solution3(int n) {
        return fibonacci(n);
    }

    int[] arr = new int[100001];
    public int fibonacci(int n) {
        if (n==0 || n==1) return n;
        else if (arr[n] != 0) return arr[n];
        return arr[n] = (fibonacci(n-1)%1234567 + fibonacci(n-2)%1234567)%1234567;
    }

    // 다음 큰 숫자
    // 효율성 : 시간 초과
    public static int solution2(int n) {
        int answer = n;
        while (true) {
//            long countNum = Arrays.stream(Integer.toBinaryString(n).split("")).filter(num -> num.equals("1")).count();
//            long countNext = Arrays.stream(Integer.toBinaryString(++answer).split("")).filter(num -> num.equals("1")).count();
//            if (countNum == countNext) return answer;
            int countNum = Integer.bitCount(Integer.parseInt(Integer.toBinaryString(n)));
            int countNext = Integer.bitCount(Integer.parseInt(Integer.toBinaryString(++answer)));
            if (countNum == countNext) return answer;
        }
    }

    // 숫자의 표현
    public static int solution1(int n) {
        int count = 0;
//        for (int i=1; i<=n; ++i) {
//            int sum = IntStream.rangeClosed(i, n)
//                    .reduce((total, number) -> {
//                        if (total < n) return total + number;
//                        else return total;
//                    }).orElse(0);
//            if (sum == n) ++count;
//        }
        for (int i=1; i<=n/2; ++i) { // 절반을 초과한 숫자에 대해서는 자기 자신을 제외하고 연속한 자연수들의 합으로 표현되지 않는다.
            int sum = 0;
            int start = i;
            while (sum < n) {
                sum += start++;
            }
            if (sum == n) ++count;
        }
        return count+1; // 자기자신 더하는 것으로 + 1
    }
}
