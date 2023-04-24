package basic;

import java.util.*;

public class Basic3 {

    public static void main(String[] args) {

    }

    //중복된 문자 제거
    public String solution20(String my_string) {
        String str = "";
        for (int i=0; i<my_string.length(); ++i) {
            if (!str.contains(String.valueOf(my_string.charAt(i))))
                str += my_string.charAt(i);
        }
        return str;
    }

    //문자열 정렬하기 (2)
    public String solution19(String my_string) {
        String[] str = my_string.split("");
        for (int i=0; i<str.length; ++i) {
            str[i] = str[i].toLowerCase();
        }
        Arrays.sort(str);
        String result = "";
        for (int i=0; i<str.length; ++i) {
            result += str[i];
        }
        return result;
    }

    //합성수 찾기
    public int solution18(int n) {
        int count = 0;
        for (int i=1; i<=n; ++i) {
            if (!isPrime(i)) ++count;
        }
        return count;
    }

    public boolean isPrime(int num) {
        int count = 0;
        for (int i=1; i<=num; ++i) {
            if (num % i == 0) ++count;
            if (count > 2) return false;
        }
        return true;
    }

    //숫자 찾기
    public int solution17(int num, int k) {
        List<Integer> numbers = new ArrayList<>();
        while (num > 0) {
            numbers.add(num%10);
            num/=10;
        }
        Collections.reverse(numbers);
        if (numbers.contains(k)) return numbers.indexOf(k)+1;
        return -1;
    }

    //약수 구하기
    public int[] solution16(int n) {
        List<Integer> num = new ArrayList<>();
        for (int i=1; i<=n; ++i) {
            if (n % i == 0) num.add(i);
        }

        return num.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //369게임
    public int solution15(int order) {
        int count = 0;
        while (order > 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 ==9) ++count;
            order /= 10;
        }
        return count;
    }

    //피자 나눠 먹기 (2)
    public int solution14(int n) {
        int num = 0;
        for (int i=1; i<101; ++i) {
            if ((i * 6) % n == 0) {
                return i;
            }
        }
        return num;
    }

    //가장 큰 수 찾기
    public int[] solution13(int[] array) {
        int[] num = new int[2];
        for (int i=0; i<array.length; ++i) {
            if (num[0] < array[i]) {
                num[0] = array[i];
                num[1] = i;
            }
        }
        return num;
    }

    //외계 행성의 나이
    public String solution12(int age) {
        String str = "";
        String[] letter = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        while (age > 0) {
            str = letter[age%10] + str;
            age /= 10;
        }

        return str;
    }

    //배열 회전시키기
    public int[] solution11(int[] numbers, String direction) {
        int len = numbers.length;
        List<Integer> num = new ArrayList<>();
        if (direction.equals("right")) {
            num.add(numbers[len-1]);
            for (int i=0; i<len-1; ++i) {
                num.add(numbers[i]);
            }
        } else {
            for (int i=1; i<len; ++i) {
                num.add(numbers[i]);
            }
            num.add(numbers[0]);
        }

        return num.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //인덱스 바꾸기
    public String solution10(String my_string, int num1, int num2) {
        String str = "";
        char temp1 = my_string.charAt(num1);
        char temp2 = my_string.charAt(num2);
        for (int i=0; i<my_string.length(); ++i) {
            if (i == num1) str += temp2;
            else if (i == num2) str += temp1;
            else str += my_string.charAt(i);
        }
        return str;
    }

    //n의 배수 고르기
    public int[] solution9(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for (int i=0; i<numlist.length; ++i) {
            if (numlist[i]%n == 0) answer.add(numlist[i]);
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //최댓값 만들기 (2)
    public int solution8(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length;
        int max1 = numbers[0] * numbers[1];
        int max2 = numbers[len-1] * numbers[len-2];
        return max1>max2 ? max1 : max2;
    }

    //직각삼각형 출력하기
//    public static void main(String[] args) {
    public void solution7() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; ++i) {
            for (int j=0; j<=i; ++j) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    //문자열 정렬하기 (1)
    public int[] solution6(String my_string) {
        String newStr = "";
        for (int i=0; i<my_string.length(); ++i) {
            if ('0'<=my_string.charAt(i) && my_string.charAt(i)<='9') newStr += my_string.charAt(i);
        }

        int[] num = new int[newStr.length()];
        for (int i=0; i<newStr.length(); ++i) {
            num[i] = Integer.parseInt(String.valueOf(newStr.charAt(i)));
        }
        Arrays.sort(num);
        return num;
    }

    //주사위의 개수
    public int solution5(int[] box, int n) {
        return (box[0]/n) * (box[1]/n) * (box[2]/n);
    }

    //세균 증식
    public int solution4(int n, int t) {
        for (int i=0; i<t; ++i) {
            n *= 2;
        }
        return n;
    }

    //대문자와 소문자
    public String solution3(String my_string) {
        String answer = "";
        for (int i=0; i<my_string.length(); ++i) {
            if (Character.isUpperCase(my_string.charAt(i))) answer += Character.toLowerCase(my_string.charAt(i));
            else answer += Character.toUpperCase(my_string.charAt(i));
        }
        return answer;
    }

    //가위 바위 보
    public String solution2(String rsp) {
        String answer = "";
        for (int i=0; i<rsp.length(); ++i) {
            if (rsp.charAt(i) == '0') answer += '5';
            else if (rsp.charAt(i) == '2') answer += '0';
            else if (rsp.charAt(i) == '5') answer += '2';
        }
        return answer;
    }

    //암호 해독
    public String solution1(String cipher, int code) {
        String answer = "";
        for (int i=0; i<cipher.length(); ++i) {
            if ((i+1)%code == 0) answer += cipher.charAt(i);
        }
        return answer;
    }
}
