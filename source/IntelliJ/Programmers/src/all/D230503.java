package all;

import java.util.*;

public class D230503 {

    //배열의 길이에 따라 다른 연산하기
    public int[] solution11(int[] arr, int n) {
        if (arr.length % 2 != 0) {
            for (int i = 0; i < arr.length; ++i) {
                if (i % 2 == 0) arr[i] += n;
            }
        } else {
            for (int i = 0; i < arr.length; ++i) {
                if (i % 2 != 0) arr[i] += n;
            }
        }
        return arr;
    }

    //주사위 게임 1
    public int solution10(int a, int b) {
        if (a%2!=0 && b%2!=0) return a*a + b*b;
        else if (a%2==0 && b%2==0) return Math.abs(a - b);
        else return 2 * (a + b);
    }

    //뒤에서 5등 위로
    public int[] solution9(int[] num_list) {
        return Arrays.stream(num_list).sorted().skip(5).toArray();
    }

    //문자열 정수의 합
    public int solution8(String num_str) {
        return Arrays.stream(num_str.split("")).map(Integer::parseInt).mapToInt(Integer::intValue).sum();
    }

    //부분 문자열
    public int solution7(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }

    //부분 문자열인지 확인하기
    public int solution6(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }

    //정수 찾기
    public int solution5(int[] num_list, int n) {
        return Arrays.stream(num_list).anyMatch(s -> s == n) ? 1 : 0;
    }

    //문자열로 변환
    public String solution4(int n) {
        return Integer.toString(n);
    }

    //조건에 맞게 수열 변환하기 3
    public int[] solution3(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            if (k%2==1) answer[i] = arr[i] * k;
            else answer[i] = arr[i] + k;
        }
        return answer;
    }

    //정수 부분
    public int solution2(double flo) {
        return (int) flo;
    }

    //문자열을 정수로 변환하기
    public int solution1(String n_str) {
        return Integer.parseInt(n_str);
    }
}
