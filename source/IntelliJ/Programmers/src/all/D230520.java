package all;

public class D230520 {

    public static void main(String[] args) {
        System.out.println();
//        System.out.println(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));
//        System.out.println(solution("2three45sixseven"));
    }

    // 숫자 문자열과 영단어
    public static int solution3(String s) {
        String[] num = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i=0; i<num.length; ++i) {
            s = s.replace(num[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    // 크기가 작은 부분문자열
    public int solution2(String t, String p) {
        int len = p.length();
        long[] num = new long[t.length()-len+1];
        int count = 0;
        for (int i=0; i<t.length()-len+1; ++i) {
            num[i] = Long.parseLong(t.substring(i, i+len));
            if (num[i] <= Long.parseLong(p)) ++count;
        }
        return count;
    }

    // [1차] 비밀지도
    public static String[] solution1(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        int[][] arr = new int[n][n];
        String[][] binArr1 = new String[n][n];
        String[][] binArr2 = new String[n][n];
        for (int i=0; i<n; ++i) {
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            while (s1.length() != n) {
                s1 = "0" + s1;
            }
            while (s2.length() != n) {
                s2 = "0" + s2;
            }
            binArr1[i] = s1.split("");
            binArr2[i] = s2.split("");
        }

        for (int i=0; i<n; ++i) {
            for (int j=0; j<n; ++j) {
                arr[i][j] = Integer.parseInt(binArr1[i][j]) + Integer.parseInt(binArr2[i][j]);
            }
        }

        for (int i=0; i<n; ++i) {
            String s = "";
            for (int j=0; j<n; ++j) {
                if (arr[i][j] > 0) s += "#";
                else s += " ";
            }
            answer[i] = s;
        }

        return answer;
    }
}
