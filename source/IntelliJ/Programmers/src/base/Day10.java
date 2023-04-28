package base;

import java.util.ArrayList;
import java.util.List;

public class Day10 {

    //qr code
    public String solution5(int q, int r, String code) {
        int len = code.length();
        String answer = "";
        for (int i=0; i<len; ++i) {
            if (i%q==r) answer += code.charAt(i);
        }
        return answer;
    }

    //세로 읽기
    public String solution4(String my_string, int m, int c) {
        int len = my_string.length();
        String answer = "";
        for (int i=0; i<len; ++i) {
            if (i%m == c-1) answer += my_string.charAt(i);
        }
        return answer;
    }

    //문자열 뒤집기
    public String solution3(String my_string, int s, int e) {
        String str = my_string.substring(s, e+1);
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        return my_string.replace(my_string.substring(s, e+1), str);
    }

    //접두사인지 확인하기
    public int solution2(String my_string, String is_prefix) {
        List<String> list = new ArrayList<>();
        for (int i=0; i<my_string.length(); ++i) {
            list.add(my_string.substring(0, i));
        }

        return list.contains(is_prefix)? 1 : 0;
    }

    //문자열 앞의 n글자
    public String solution1(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
