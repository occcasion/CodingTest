package base;

import java.util.Arrays;

public class Day15 {

    //원하는 문자열 찾기
    public int solution5(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        if (myString.contains(pat)) return 1;
        else return 0;
    }

    //길이에 따른 연산
    public int solution4(int[] num_list) {
        int sum = 0;
        int result = 1;

        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; ++i) {
                sum += num_list[i];
            }
            return sum;
        } else {
            for (int i = 0; i < num_list.length; ++i) {
                result *= num_list[i];
            }
            return result;
        }
    }

    //1로 만들기
    public int solution3(int[] num_list) {
        int[] n = new int[num_list.length];

        for (int i = 0; i < num_list.length; ++i) {
            int count = 0;
            for ( ; ; ) {
                if (num_list[i] == 1) break;
                if (num_list[i] % 2 == 0) num_list[i] /= 2;
                else num_list[i] = (num_list[i]-1) / 2;
                ++count;
            }
            num_list[i] = count;
        }

        int sum = 0;
        for (int i = 0; i < num_list.length; ++i) {
            sum += num_list[i];
        }

        return sum;
    }

    //조건에 맞게 수열 변환하기 2
    public int solution2(int[] arr) {
        int x = 0;
        int[] before = new int[arr.length];


        for ( ; ; ) {
            before = arr.clone();
            for (int i = 0; i < arr.length; ++i) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2;
                else if (arr[i] < 50 && arr[i] % 2 == 1) arr[i] = arr[i] * 2 + 1;
            }
            if (Arrays.equals(arr, before)) break;
            ++x;
        }
        return x;
    }

    //조건에 맞게 수열 변환하기 1
    public int[] solution1(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if ((arr[i] >= 50) && (arr[i] % 2 == 0)) arr[i] /= 2;
            else if ((arr[i] < 50) && (arr[i] % 2 == 1)) arr[i] *= 2;
        }
        return arr;
    }
}
