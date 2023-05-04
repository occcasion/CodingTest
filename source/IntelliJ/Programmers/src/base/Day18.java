package base;

import java.util.*;
import java.util.stream.Collectors;

public class Day18 {

    //rny_string
    public String solution5(String rny_string) {
        String answer = "";
        for (int i = 0; i < rny_string.length(); ++i) {
            if (rny_string.charAt(i) == 'm') answer += "rn";
            else answer += rny_string.charAt(i);
        }
        return answer;
    }

    //문자열 바꿔서 찾기
    public int solution4(String myString, String pat) {
        String pat2 = "";
        for (int i = 0; i < pat.length(); ++i) {
            if (pat.charAt(i) == 'A') pat2 += "B";
            else pat2 += "A";
        }
        if (myString.contains(pat2)) return 1;
        else return 0;
    }

    // 간단한 식 계산하기
    public int solution3(String binomial) {
        String[] str = binomial.split(" ");
        if (str[1].equals("+")) return Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
        else if (str[1].equals("-")) return Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
        else if (str[1].equals("*")) return Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
        return 0;
    }

    //문자열 잘라서 정렬하기
    public String[] solution2(String myString) {
        String[] arr = myString.split("x");
        Arrays.sort(arr);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; ++i) {
            if (!arr[i].isEmpty()) list.add(arr[i]);
        }
        return list.toArray(new String[list.size()]);
    }

    //x 사이의 개수
    public static int[] solution1(String myString) {
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; ++i) {
            answer.add((list.get(i)).length());
        }
        
        if (myString.charAt(myString.length()-1) == 'x') answer.add(0);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
