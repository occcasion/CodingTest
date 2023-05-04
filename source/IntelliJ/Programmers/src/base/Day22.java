package base;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day22 {

    // 배열의 원소 삭제하기
    public int[] solution4(int[] arr, int[] delete_list) {
        List<Integer> deleteList = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
        return Arrays.stream(arr).filter(n -> !deleteList.contains(n)).toArray();
    }

    // 두 수의 합
    public String solution2(String a, String b) {
        return (new BigInteger(a).add(new BigInteger(b))).toString();
    }

    // 0 떼기
    public String solution1(String n_str) {
        while (n_str.charAt(0) == '0') {
            n_str = n_str.substring(1);
        }
        return n_str;
    }
}
