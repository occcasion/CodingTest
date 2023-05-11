package all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D230512 {

    // 최댓값과 최솟값
    public String solution3(String s) {
        String[] nums = s.split(" ");
        int min = Arrays.stream(nums).mapToInt(Integer::parseInt).min().getAsInt();
        int max = Arrays.stream(nums).mapToInt(Integer::parseInt).max().getAsInt();
        return min + " " + max;
    }

    // 문자열 다루기 기본
    public boolean solution2(String s) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
        return (s.length()==4 || s.length()==6) && s.chars().mapToObj(Character::isDigit).allMatch(n -> n==true);
    }

    // 부족한 금액 계산하기
    public long solution1(int price, int money, int count) {
        long answer = 0;

        for (int i=1; i<=count; ++i) {
            answer += i * price;
        }

        if (money-answer > 0) return 0;
        else return answer-money;
    }
}
