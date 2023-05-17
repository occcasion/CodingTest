package all;

import java.util.Arrays;

public class D230518 {

    public static void main(String[] args) {
        System.out.println('Z' < 'z');
        int[] arr = "hello".chars().toArray();
        System.out.println((char)arr[0]);
    }


    // 최소직사각형
    public int solution3(int[][] sizes) {
        int widthMax = 0;
        int heightMax = 0;
        for (int i=0; i<sizes.length; ++i) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            if (widthMax < max) widthMax = max;
            if (heightMax < min) heightMax = min;
        }

        return widthMax*heightMax;
    }

    // 삼총사
    public int solution2(int[] number) {
        int answer = 0;

        for (int i=0; i<number.length; ++i) {
            for (int j=i; j<number.length; ++j) {
                for (int k=j; k<number.length; ++k) {
                    if (i==j || j==k || k==i) continue;
                    if (number[i]+number[j]+number[k] == 0) ++answer;
                }
            }
        }

        return answer;
    }

    // 시저 암호
    public String solution1(String s, int n) {
        String answer = "";

        int[] arr = s.chars().toArray();
        for (int i=0; i<arr.length; ++i) {
            if (arr[i] == ' ') {
                answer += " ";
                continue;
            }
            if ('a' <= arr[i]&&arr[i] <= 'z'&&arr[i]+n > 'z') {
                arr[i] += n;
                while (!('a' <= arr[i]&&arr[i] <= 'z')) arr[i] -= 26;
            }
            else if ('A' <= arr[i]&& arr[i] <= 'Z' && arr[i]+n > 'Z') {
                arr[i] += n;
                while (!('A' <= arr[i]&& arr[i] <= 'Z')) arr[i] -= 26;
            }
            else arr[i] += n;
            answer += (char) arr[i];
        }

        return answer;
    }
}
