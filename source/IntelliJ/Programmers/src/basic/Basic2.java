package basic;

import java.util.Arrays;

public class Basic2 {

    public static void main(String[] args) {
    }

    //제곱수 판별하기
    public int solution20(int n) {
        int answer = 2;
        if (Math.sqrt(n)%1 == 0) answer= 1;
        return answer;
    }

    //문자열안에 문자열
    public int solution19(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)) answer  = 1;
        else answer =2;
        return answer;
    }

    //개미 군단
    public int solution18(int hp) {
        return hp/5 + (hp%5)/3 + (hp%5)%3;
    }

    //숨어있는 숫자의 덧셈 (1)
    public int solution17(String my_string) {
        int answer = 0;
        for (int i=0; i<my_string.length(); ++i) {
            if('0'<=my_string.charAt(i) && my_string.charAt(i)<='9')
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }
        return answer;
    }

    //자릿수 더하기
    public int solution16(int n) {
        int answer = 0;
        while (n > 9) {
            answer += n%10;
            n = n/10;
        }
        return answer+n;
    }

    //배열의 유사도
    public int solution15(String[] s1, String[] s2) {
        int answer = 0;
        for (int i=0; i<s1.length; ++i) {
            for (int j=0; j<s2.length; ++j) {
                if (s1[i].equals(s2[j])) ++answer;
            }
        }
        return answer;
    }

    //짝수는 싫어요
    public int[] solution14(int n) {
        int[] answer;
        if (n%2 == 0) answer = new int[n/2];
        else answer = new int[n/2+1];
        int count = 0;
        for (int i=1; i<=n; ++i)
            if (i%2 == 1) answer[count++] = i;
        return answer;
    }

    //편지
    public int solution13(String message) {
        return message.length()*2;
    }

    //삼각형의 완성조건 (1)
    public int solution12(int[] sides) {
        int answer = 2;
        if (sides[0]+sides[1]>sides[2] && sides[1]+sides[2]>sides[0] && sides[2]+sides[0]>sides[1]) answer = 1;
        return answer;
    }

    //모음 제거
    public String solution11(String my_string) {
        String answer = "";
        for (int i=0; i<my_string.length(); ++i) {
            if (my_string.charAt(i) == 'a' || my_string.charAt(i) == 'e' || my_string.charAt(i) == 'i' || my_string.charAt(i) == 'o' || my_string.charAt(i) == 'u') continue;
            answer += my_string.charAt(i);
        }
        return answer;
    }

    //중앙값 구하기
    public int solution10(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }

    //순서쌍의 개수
    public int solution9(int n) {
        int answer = 0;
        for (int i=1; i<=n; ++i) {
            if (n % i == 0) ++answer;
        }
        return answer;
    }

    //아이스 아메리카노
    public int[] solution8(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }

    //옷가게 할인받기
    public int solution7(int price) {
        double answer = 0;
        int result = 0;
        if (price >= 100000 && price < 300000) answer = price * 0.95;
        else if (price >= 300000 && price < 500000) answer = price * 0.9;
        else if (price >= 500000) answer = price * 0.8;
        //answer가 0으로 초기화 되어 있으므로 나머지 케이스들에 꼭 price를 넣어줘야 한다.
        else answer = price;
        result = (int)Math.floor(answer) / 10 * 10;
        return result;
    }

    //특정 문자 제거하기
    public String solution6(String my_string, String letter) {
        String answer = "";
        for (int i=0; i<my_string.length(); ++i) {
            if (letter.equals(String.valueOf(my_string.charAt(i)))) continue;
            answer += my_string.charAt(i);
        }
        return answer;
    }

    //문자 반복 출력하기
    public String solution5(String my_string, int n) {
        String answer = "";
        for (int i=0; i<my_string.length(); ++i) {
            for (int j=0; j<n; ++j) {
                answer = answer + my_string.charAt(i);
            }
        }
        return answer;
    }

    //피자 나눠 먹기 (3)
    public int solution4(int slice, int n) {
        int answer = 0;
        for (int i=0; i<100; ++i) {
            if (slice * i >= n) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    //최댓값 만들기(1)
    public int solution3(int[] numbers) {
        int answer = 0;
        int len = numbers.length;
        for (int i=0; i<len-1; ++i) {
            for (int j=i+1; j<len; ++j) {
                if (answer < numbers[i]*numbers[j])
                    answer = numbers[i]*numbers[j];
            }
        }
        return answer;
    }

    //점의 위치 구하기
    public int solution2(int[] dot) {
        int answer = 0;
        if (dot[0] > 0) {
            if (dot[1] > 0) answer = 1;
            else answer = 4;
        } else {
            if (dot[1] > 0) answer = 2;
            else answer = 3;
        }
        return answer;
    }

    //배열 원소의 길이
    public int[] solution1(String[] strlist) {
        int len = strlist.length;
        int[] answer = new int[len];
        for (int i=0; i<len; ++i) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
