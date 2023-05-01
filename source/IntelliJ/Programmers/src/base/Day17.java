package base;

import java.util.ArrayList;
import java.util.List;

public class Day17 {
    public static void main(String[] args) {
        System.out.println(solution2("banana", "ana"));
    }

    //공백으로 구분하기 2
    public String[] solution5(String my_string) {
        my_string = my_string.trim();
        my_string = my_string.replaceAll("\\s+", " ");
        return my_string.split(" ");
    }

    //공백으로 구분하기 1
    public String[] solution4(String my_string) {
        return my_string.split(" ");
    }

    //ad 제거하기
    public String[] solution3(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; ++i) {
            if (! strArr[i].contains("ad")) list.add(strArr[i]);
        }
        return list.toArray(new String[list.size()]);
    }

    //문자열이 몇 번 등장하는지 세기
    public static int solution2(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString);
        int count = 0;
        for (int i = 0; i < myString.length(); ++i) {
            if (myString.contains(pat)) {
                sb.setCharAt(myString.indexOf(pat), '*');
                myString = sb.toString();
                ++count;
            }
        }
        return count;
    }

    //특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
    public String solution1(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}
