package all;

import java.util.*;
import java.util.stream.Collectors;

public class D230510 {

    //수박수박수박수박수박수?
    public String solution5(int n) {
        String answer = "";
        int count = 0;
        while (count < n) {
            ++count;
            if (count%2==0) answer +="박";
            else answer += "수";
        }
        return answer;
    }

    // 가운데 글자 가져오기
    public String solution4(String s) {
        int len = s.length();
        String answer = "";
        if (len % 2 == 0) return answer + s.charAt(len/2-1) + s.charAt(len/2);
        else return answer + s.charAt(len/2);
    }

    // 제일 작은 수 제거하기
    public int[] solution3(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        return Arrays.stream(arr).filter(n -> n!=Arrays.stream(arr).min().getAsInt()).toArray();
    }

    // 없는 숫자 더하기
    public int solution2(int[] numbers) {
        int answer = 0;

        List<Integer> numList = Arrays.stream(numbers).sorted().boxed().collect(Collectors.toList());
        for (int i = 0; i < 10; ++i) {
            if (!numList.contains(i)) answer += i;
        }

        return answer;
    }

    // 음양 더하기
    public int solution1(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; ++i) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }

        return answer;
    }
}
