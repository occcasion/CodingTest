package base;

import java.util.*;
import java.util.stream.Collectors;

public class Day13 {

    //n개 간격의 원소들
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; ++i) {
            if (i%n==0) list.add(num_list[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    //n번째 원소까지
    public int[] solution4(int[] num_list, int n) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        list = list.subList(0, n);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    //왼쪽 오른쪽
    public String[] solution3(String[] str_list) {
        List<String> list = new ArrayList<>();
        int idx = -1;
        String str = "";
        for (int i = 0; i < str_list.length; ++i) {
            if (str_list[i].equals("l")) {
                idx = i;
                str = "l";
                break;
            }
            if (str_list[i].equals("r")) {
                idx = i;
                str = "r";
                break;
            }
        }
        if (idx == -1) return new String[]{};
        if (str.equals("l")) {
            if (idx == 0) return new String[]{};
            else {
                for (int i = 0; i < idx; ++i) {
                    list.add(str_list[i]);
                }
                return list.toArray(new String[list.size()]);
            }
        } else if (str.equals("r")) {
            if (idx == str_list.length - 1) return new String[]{};
            else {
                for (int i = idx + 1; i < str_list.length; ++i) {
                    list.add(str_list[i]);
                }
                return list.toArray(new String[list.size()]);
            }
        }
        return new String[]{};
    }

    //순서 바꾸기
    public int[] solution2(int[] num_list, int n) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        List<Integer> firstList = list.subList(0, n);
        List<Integer> secondList = list.subList(n, list.size());
        secondList.addAll(firstList);
        return secondList.stream().mapToInt(Integer::intValue).toArray();
    }

    //n번째 원소부터
    public int[] solution1(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i=n-1; i<=num_list.length-1; ++i) {
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
