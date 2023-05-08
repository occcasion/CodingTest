package all;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class D230509 {

    // 핸드폰 번호 가리기
    public String solution5(String phone_number) {
        String answer = "";
        for (int i=0; i<phone_number.length()-4; ++i) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4);
        return answer;
    }

    // 나누어 떨어지는 숫자 배열
    public int[] solution4(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.stream(arr).filter( i -> i%divisor==0).sorted().mapToObj(Integer::new).collect(Collectors.toList());

        if (list.isEmpty()) return new int[]{-1};
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    // 서울에서 김서방 찾기
    public String solution3(String[] seoul) {
        List<String> seoulList = new ArrayList<>(Arrays.asList(seoul));
        return "김서방은 " + seoulList.indexOf("Kim") + "에 있다";
    }

    // 콜라츠 추측
    public int solution2(int num) {
        if (num == 1) return 0;

        long number = num;
        int count = 0;
        while (number != 1 && count < 500) {
            if (number % 2 == 0) {
                number /= 2;
                ++count;
            }
            else {
                number = number * 3 + 1;
                ++count;
            }
        }
        if (number == 1) return count;
        return -1;
    }

    // 두 정수 사이의 합
    public long solution1(int a, int b) {
        return LongStream.rangeClosed(a<b?a:b, a<b?b:a).sum();
    }
}
