package base;

import java.util.*;
import java.util.stream.Collectors;

public class Day12 {

    //배열 조각하기
    public int[] solution5(int[] arr, int[] query) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i=0; i<query.length; ++i) {
            if (i % 2 == 0) {
                list = list.subList(0, query[i]+1);
            } else {
                list = list.subList(query[i], list.size());
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    //2의 영역
    public int[] solution4(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        int startIdx = list.indexOf(2);
        int endIdx = list.lastIndexOf(2);
        if (startIdx==-1) return new int[]{-1};
        for (int i=startIdx; i<=endIdx; ++i) {
            result.add(Integer.valueOf(arr[i]));
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    //배열 만들기 3
    public int[] solution3(int[] arr, int[][] intervals) {
        List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        result.addAll(list1.subList(intervals[0][0], intervals[0][1]+1));
        result.addAll(list2.subList(intervals[1][0], intervals[1][1]+1));

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    //첫번째로 나오는 음수
    public int solution2(int[] num_list) {
        for (int i=0; i<num_list.length; ++i) {
            if (num_list[i] < 0) return i;
        }
        return -1;
    }

    //리스트 자르기
    public int[] solution1(int n, int[] slicer, int[] num_list) {
        if (n==1) {
            return sublist(num_list, 0, slicer[1])
                    .stream().mapToInt(Integer::intValue).toArray();
        }
        else if (n==2) {
            return sublist(num_list, slicer[0], num_list.length-1)
                    .stream().mapToInt(Integer::intValue).toArray();
        }
        else if (n == 3) {
            return sublist(num_list, slicer[0], slicer[1])
                    .stream().mapToInt(Integer::intValue).toArray();
        }
        else {
            List<Integer> list = new ArrayList<>();
            for (int i=slicer[0]; i<=slicer[1]; ++i) {
                if ((i-slicer[0])%slicer[2]==0) list.add(num_list[i]);
            }
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    List<Integer> sublist(int[] arr, int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i=start; i<=end; ++i) {
            result.add(arr[i]);
        }
        return result;
    }
}
