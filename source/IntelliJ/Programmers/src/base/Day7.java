package base;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day7 {

    //배열 만들기 4
    public int[] solution5(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i<arr.length) {
            if (list.isEmpty()) list.add(arr[i++]);
            else {
                if (list.get(list.size()-1) < arr[i]) list.add(arr[i++]);
                else list.remove(list.size()-1);
            }
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //콜라츠 수열 만들기
    public int[] solution4(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (n != 1) {
            if (n%2==0) {
                n /= 2;
                list.add(n);
            } else {
                n = 3 * n + 1;
                list.add(n);
            }
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //카운트 업
    public int[] solution3(int start, int end) {
        List<Integer> list = new ArrayList<>();
        for (int i=start; i<=end; ++i) {
            list.add(i);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //배열 만들기 2
    public int[] solution2(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i=l; i<=r; ++i) {
            int count = 0;
            String num = Integer.toString(i);
            for (int j=0; j<num.length(); ++j) {
                if (num.charAt(j)=='1' || num.charAt(j)=='2' || num.charAt(j)=='3' || num.charAt(j)=='4' || num.charAt(j)=='6' || num.charAt(j)=='7' || num.charAt(j)=='8' || num.charAt(j)=='9') ++count;
            }
            if (count>0) continue;
            list.add(i);
        }
        int[] nums = new int[list.size()];
        nums = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        if (nums.length==0) return new int[]{-1};
        return nums;
    }

    //수열과 구간 쿼리
    public int[] solution1(int[] arr, int[][] queries) {
        for (int i=0; i<queries.length; ++i) {
            for (int j=queries[i][0]; j<=queries[i][1]; ++j) {
                if (j%queries[i][2]==0) ++arr[j];
            }
        }
        return arr;
    }
}
