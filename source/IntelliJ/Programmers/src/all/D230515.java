package all;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class D230515 {

    // 3진법 뒤집기
    public int solution3(int n) {
        String number = Integer.toString(n, 3);
        number = new StringBuilder(number).reverse().chars().mapToObj(Character::toString).collect(Collectors.joining());
        return Integer.parseInt(number, 3);
    }

    // 이진 변환 반복하기
    // TODO
    public int[] solution2(String s) {
        List<Integer> answer = new ArrayList<>();
        while (s.chars().filter(n -> n=='0').count() != 0) {
            answer.add((int)s.chars().filter(n -> n=='0').count());
            s = s.chars().filter(n -> n=='1').mapToObj(Character::toString).collect(Collectors.joining());
            int len = s.length();
            List<Integer> list = new ArrayList<>();
            while (len > 0) {
                list.add(0, len%2);
                len /= 2;
            }
            s = list.toString();
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    // 같은 숫자는 싫어
    public int[] solution1(int []arr) {
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<arr.length; ++i) {
            if (i==0) list.add(arr[i]);
            else {
                if (arr[i]!=arr[i-1]) list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
