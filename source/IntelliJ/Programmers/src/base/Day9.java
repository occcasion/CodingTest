package base;

import java.util.*;

public class Day9 {

    //접미사인지 확인하기
    public int solution(String my_string, String is_suffix) {
        List<String> list = new ArrayList<>();
        for (int i=0; i<my_string.length(); ++i) {
            list.add(my_string.substring(i));
        }
        for (int i=0; i<list.size(); ++i) {
            if (list.contains(is_suffix)) return 1;
        }
        return 0;
    }

    //접미사 배열
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i=0; i<my_string.length(); ++i) {
            list.add(my_string.substring(i));
        }
        String[] str = list.toArray(new String[list.size()]);
        Arrays.sort(str);
        return str;
    }

    //문자열 뒤의 n글자
    public String solution3(String my_string, int n) {
        return my_string.substring(my_string.length()-n);
    }

    //부분 문자열 이어 붙여 문자열 만들기
    public String solution2(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i=0; i<parts.length; ++i) {
            if (parts[i][1] == my_strings[i].length()-1) answer += my_strings[i].substring(parts[i][0]);
            else answer += my_strings[i].substring(parts[i][0], parts[i][1]+1);
        }
        return answer;
    }

    //배열 만들기 5
    public int[] solution1(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        String str = "";
        for (int i=0; i<intStrs.length; ++i) {
            str = intStrs[i].substring(s, s+l);
            int num = Integer.parseInt(str);
            if (num > k) list.add(num);
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
