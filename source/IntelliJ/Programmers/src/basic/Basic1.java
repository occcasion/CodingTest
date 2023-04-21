package basic;

import java.util.Arrays;

public class Basic1 {
    public static void main(String[] args) {

    }

    //짝수 홀수 개수
    public int[] solution20(int[] num_list) {
        int[] answer = new int[2];
        for (int i=0; i<num_list.length; ++i) {
            if (num_list[i] % 2 == 0) ++answer[0];
            else ++answer[1];
        }
        return answer;
    }

    //문자열 뒤집기
    public String solution19(String my_string) {
        String answer = "";
        for (int i=my_string.length()-1; i>=0; --i) {
            answer += my_string.charAt(i);
        }
        return answer;
    }

    //피자 나눠 먹기
    public int solution18(int n) {
        int answer = 0;
        for (int i=0; i<100; ++i) {
            if (i*7 >= n) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    //중복된 숫자 개수
    public int solution17(int[] array, int n) {
        int answer = 0;
        for (int i=0; i<array.length; ++i) {
            if (array[i]==n) ++answer;
        }
        return answer;
    }

    //머쓱이보다 키 큰 사람
    public int solution16(int[] array, int height) {
        int answer = 0;
        for (int i=0; i<array.length; ++i) {
            if (array[i]>height) ++answer;
        }
        return answer;
    }

    //배열 뒤집기
    public int[] solution15(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len];
        for (int i=0; i<len; ++i) {
            answer[i] = num_list[len-1-i];
        }
        return answer;
    }

    //배열 자르기
    public int[] solution14(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }

    //배열 두 배 만들기
    public int[] solution13(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        for (int i=0; i<len; ++i) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    //양꼬치
    public int solution12(int n, int k) {
        int answer = 0;
        answer = n * 12000 + (k-(n/10)) * 2000;
        return answer;
    }

    //배열의 평균값
    public double solution11(int[] numbers) {
        double answer = 0;
        int len = numbers.length;
        for (int i=0; i<len; ++i) {
            answer += numbers[i];
        }
        answer = answer / len;
        return answer;
    }

    //짝수의 합
    public int solution10(int n) {
        int answer = 0;
        for (int i=1; i<=n; ++i) {
            if (i%2 != 0) continue;
            answer += i;
        }
        return answer;
    }

    //각도기
    public int solution9(int angle) {
        int answer = 0;
        if (angle < 90) answer = 1;
        else if (angle == 90) answer = 2;
        else if (angle > 90 && angle < 180) answer = 3;
        else answer = 4;
        return answer;
    }

    //두 수의 나눗셈
    public int solution8(int num1, int num2) {
        int answer = 0;
        double res = (double) num1 / (double) num2;
        answer = (int)(res * 1000);
        return answer;
    }

    //두 수의 합
    public int solution7(int num1, int num2) {
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }

    //나이 출력
    public int solution6(int age) {
        int answer = 0;
        answer = 2023 - age;
        return answer;
    }

    //숫자 비교하기
    public int solution5(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) answer = 1;
        else answer = -1;
        return answer;
    }

    //나머지 구하기
    public int solution4(int num1, int num2) {
        int answer = -1;
        answer = num1%num2;
        return answer;
    }

    //두 수의 차
    public int solution3(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }

    //두 수의 곱
    public int solution2(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2;
        return answer;
    }

    //몫 구하기
    public int solution1(int num1, int num2) {
        int answer = 0;
        answer = num1/num2;
        return answer;
    }
}
