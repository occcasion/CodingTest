package all;

import java.util.*;

public class D230502 {

    // 둘만의 암호 https://school.programmers.co.kr/learn/courses/30/lessons/155652
/*    public String solution(String s, String skip, int index) {
//        Map<Integer, String> map = new HashMap<>();
//        for (int i = 0; i < 26; ++i) {
//            char c = (char)(i + 97);
//            if (skipList.contains(c)) continue;
//            map.put(i, Character.toString(c));
//        }
        List<String> skipList = new ArrayList<>(Arrays.asList(skip));
        List<String> alphabet = new ArrayList<>();
        for (int i = 0; i < 26; ++i) {
            char c = (char)(i + 97);
            if (skipList.contains(c)) continue;
            alphabet.add(Character.toString(c));
        }
        String answer = "";
        for (int i = 0; i < s.length(); ++i) {
            int idx = alphabet.indexOf(s.charAt(i)) + index;
            if (idx > 25) idx -= 26;
            answer += alphabet.get(idx);
        }
        return answer;
    }*/
//    public String solution(String s, String skip, int index) {
//        List<String> list = new ArrayList<>(Arrays.asList(skip.split("")));
//        List<String> sList = new ArrayList<>(Arrays.asList(s.split("")));
//        for (int i = 0; i < s.length(); ++i) {
//            if (list.contains(s.charAt(i))) continue;
//            int c = s.charAt(i) + index;
//            if (c > 122) c -= 26;
//            sList.set(i, Character.toString(c));
//        }
//        return sList.stream().map(String::valueOf).collect(Collectors.joining());
//    }

    // 추억 점수
    public static int[] solution2(String[] name, int[] yearning, String[][] photo) {
        List<String> names = new ArrayList<>(Arrays.asList(name));
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; ++i) {
            for (int j = 0; j < photo[i].length; ++j) {
                if (names.contains(photo[i][j])) answer[i] += yearning[names.indexOf(photo[i][j])];
            }
        }
        return answer;
    }

    // 꼬리 문자열
    public String solution1(String[] str_list, String ex) {
        String answer = "";
        for (int i = 0; i < str_list.length; ++i) {
            if (str_list[i].contains(ex)) continue;
            answer += str_list[i];
        }
        return answer;
    }
}
