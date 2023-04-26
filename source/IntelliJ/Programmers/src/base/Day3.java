package base;

public class Day3 {

    public static void main(String[] args) {
        int a = 19;
        String b = Integer.toString(a);
        System.out.println(b);
    }

    //두 수의 연산값 비교하기
    public int solution5(int a, int b) {
        return Math.max(Integer.valueOf(Integer.toString(a)+Integer.toString(b)), 2*a*b);
    }

    //더 크게 합치기
    public int solution4(int a, int b) {
        int answer = 0;
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        int res1 = Integer.valueOf(strA+strB);
        int res2 = Integer.valueOf(strB+strA);
        if (res1 >= res2) return res1;
        else return res2;
    }

    //문자열 곱하기
    public String solution3(String my_string, int k) {
        String answer = "";
        for (int i=0; i<k; ++i) {
            answer += my_string;
        }
        return answer;
    }

    //문자 리스트를 문자열로 변환하기
    public String solution2(String[] arr) {
        String answer = "";
        for (int i=0; i<arr.length; ++i) {
            answer += arr[i];
        }
        return answer;
    }

    //문자열 섞기
    public String solution1(String str1, String str2) {
        String answer = "";
        for (int i=0; i<str1.length()*2; ++i) {
            if (i%2==0) answer += str1.charAt(i/2);
            else answer += str2.charAt((i-1)/2);
        }
        return answer;
    }
}
