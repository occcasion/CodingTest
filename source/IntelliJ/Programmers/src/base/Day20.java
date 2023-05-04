package base;

import java.util.*;
import java.util.stream.Collectors;

public class Day20 {

    // 뒤에서 5등까지
    public int[] solution5(int[] num_list) {
        return Arrays.stream(num_list).boxed().sorted().limit(5).mapToInt(Integer::intValue).toArray();
    }

    // 문자열 묶기
    // 문자열 배열을 받아, 그 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하기
    public int solution3(String[] strArr) {
        return Arrays.asList(strArr).stream().map(n -> n.length()).collect(Collectors.groupingBy(n -> n, Collectors.counting())).values().stream().mapToInt(Long::intValue)
                .max().orElse(1);
    }

    // 배열 비교하기
    public int solution2(int[] arr1, int[] arr2) {

        if (arr1.length > arr2.length) return 1;
        else if (arr1.length < arr2.length) return -1;
        else {
            int a = Arrays.stream(arr1).sum();
            int b = Arrays.stream(arr2).sum();
            if (a > b) return 1;
            else if (a < b) return -1;
            else return 0;
        }
    }

    // 배열의 길이를 2의 거듭제곱으로 만들기
    // https://school.programmers.co.kr/learn/courses/30/lessons/181857
    public int[] solution1(int[] arr) {
        if(isPowNum(arr.length)) return arr;

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int num = 1;
        while (arr.length > num) {
            num *= 2;
        }
        while (list.size() < num) {
            list.add(0);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean isPowNum(int num) {
        int i = 0;
        while (num >= Math.pow(2, i)) {
            ++i;
        }
        if (num == Math.pow(2, i)) return true;
        else return false;
    }


}
