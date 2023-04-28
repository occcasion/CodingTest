package base;

import java.util.*;
import java.util.stream.Collectors;

public class Day11 {

    //가까운 1 찾기
    public int solution5(int[] arr, int idx) {
        for (int i=idx; i<arr.length; ++i) {
            if (arr[i]==1) return i;
        }
        return -1;
    }

    //카운트 다운
    public int[] solution4(int start, int end) {
        List<Integer> list = new ArrayList<>();
        for (int i=start; i>=end; --i) {
            list.add(i);
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //글자 지우기
    public String solution3(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");
        List<String> list = new ArrayList<>(Arrays.asList(str));
        for (int i=0; i<indices.length; ++i) {
            list.set(indices[i], "");
        }
        return list.stream().map(String::valueOf).collect(Collectors.joining());
    }

    //배열 만들기 1
    public int[] solution2(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i=1; i<=n; ++i) {
            if (i%k==0) list.add(i);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //문자 개수 세기
    public int[] solution1(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (int i=65; i<=90; ++i) {
            int count = 0;
            for (int j=0; j<my_string.length(); ++j) {
                if (my_string.charAt(j)==i) ++count;
            }
            list.add(count);
        }
        for (int i=97; i<=122; ++i) {
            int count = 0;
            for (int j=0; j<my_string.length(); ++j) {
                if (my_string.charAt(j)==i) ++count;
            }
            list.add(count);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
