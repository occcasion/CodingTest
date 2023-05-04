package base;

import java.util.*;

public class Day19 {

    //무작위로 k개의 수 뽑기
    public static int[] solution5(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; ++i) {
            if (!answer.contains(arr[i])) answer.add(arr[i]);
        }

        for (int i = 0; i < k; ++i) {
            if (i > answer.size()-1) answer.add(-1);
        }

        return answer.subList(0, k).stream().mapToInt(Integer::intValue).toArray();
    }

    //배열 만들기 6
    public int[] solution4(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) stk.add(arr[i++]);
            else {
                if (stk.get(stk.size()-1) != arr[i]) stk.add(arr[i++]);
                else {
                    stk.remove(stk.size()-1);
                    ++i;
                }
            }
        }

        if (stk.isEmpty()) return new int[]{-1};
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }

    //빈 배열에 추가, 삭제하기
    public int[] solution3(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; ++i) {
            if (flag[i]) {
                for (int j=0; j<arr[i]*2; ++j)
                    list.add(arr[i]);
            } else {
                for (int j = 0; j < arr[i]; ++j) {
                    list.remove(list.size()-1);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    //배열의 원소만큼 추가하기
    public int[] solution2(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i]; ++j) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    //세 개의 구분자
    public String[] solution1(String myStr) {
        String[] str = myStr.split("[abc]");
        List<String> answer = new ArrayList<>();
        if (str.length==0) return new String[]{"EMPTY"};
        for (int i = 0; i < str.length; ++i) {
            if (str[i].isEmpty()) continue;
            answer.add(str[i]);
        }
        return answer.toArray(new String[answer.size()]);
    }
}
