package basic;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Basic4 {

    public static void main(String[] args) {

    }

    //외계어 사전
    public int solution20(String[] spell, String[] dic) {
        int count = 0;
        for (int i=0; i<dic.length; ++i) {
            System.out.println("dic = " + dic[i]);
            for (int j=0; j<spell.length; ++j) {
                if (dic[i].contains(spell[j])) ++count;
            }System.out.println(count);
            if (count == spell.length) return 1;
            count = 0;
        }
        return 2;
    }

    //삼각형의 완성조건 (2)
    public int solution19(int[] sides) {
        int min = 0;
        if (sides[0] > sides[1]) min = sides[0] - sides[1];
        else min = sides[1] - sides[0];

        int count = 0;
        for (int i=min+1; i<sides[0]+sides[1]; ++i) {
            ++count;
        }
        return count;
    }

    //구슬을 나누는 경우의 수
    public int solution18(int balls, int share) {
        //(balls)C(share)
        BigInteger result1 = BigInteger.ONE;
        BigInteger result2 = BigInteger.ONE;
        for (int i = 0; i < share; ++i) {
            result1 = result1.multiply(BigInteger.valueOf(balls-i));
            result2 = result2.multiply(BigInteger.valueOf(share-i));
        }
        return result1.divide(result2).intValue();
    }

    //문자열 계산하기
    public int solution17(String my_string) {
        String[] str = my_string.split(" ");
        int sum = 0;
        for (int i=0; i<str.length; ++i) {
            System.out.println(sum);
            if (i==0) sum = Integer.parseInt(str[i]);
            if (i % 2 == 1) {
                if (str[i].equals("+")) sum = sum + Integer.parseInt(str[++i]);
                else sum = sum - Integer.parseInt(str[++i]);
            }
        }
        return sum;
    }

    //잘라서 배열로 저장하기
    public String[] solution16(String my_str, int n) {
        String[] answer;
        int len = my_str.length();
        if (len%n == 0) answer = new String[len/n];
        else answer = new String[len/n+1];

        int index = 0;
        while (my_str.length() > 0) {
            System.out.println(my_str.length());
            if (my_str.length() <= n) {
                answer[index] = my_str;
                return answer;
            }
            String subStr = my_str.substring(0, n);
            answer[index++] = subStr;
            my_str = my_str.substring(n, my_str.length());
        }
        return answer;
    }

    //영어가 싫어요
    public long solution15(String numbers) {
        String str = "";
        String[] num = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        while (numbers.length() > 0) {
            for (int i=0; i<10; ++i) {
                if (numbers.startsWith(num[i])) {
                    str += i;
                    numbers = numbers.substring(num[i].length());
                }
            }
        }
        return Long.parseLong(str);
    }

    //7의 개수
    public int solution14(int[] array) {
        int count = 0;
        for (int i=0; i<array.length; ++i) {
            while (array[i] > 0) {
                if (array[i] % 10 == 7) ++count;
                array[i] = array[i]/ 10;
            }
        }
        return count;
    }

    //공 던지기
    public int solution13(int[] numbers, int k) {
        int len = numbers.length;
        int student = 0;
        for (int i=0; i<k-1; ++i) {
            student += 2;
            if (student > len) student -= len;
        }
        return numbers[student];
    }

    //소인수분해
    public int[] solution12(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i=2; i<=n; ++i) {
            if (n%i == 0 && isPrime(i)) list.add(i);
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public boolean isPrime(int n) {
        int count = 0;
        for (int i=1; i<=n; ++i) {
            if (n%i == 0) ++count;
        }
        if (count == 2) return true;
        return false;
    }

    //컨트롤 제트
    public int solution11(String s) {
        String[] str = s.split(" ");
        for (int i=0; i<str.length; ++i) {
            if (str[i].equals("Z")) {
                str[i] = "0";
                str[i - 1] = "0";
            }
        }
        int sum = 0;
        for (int i=0; i<str.length; ++i) {
            sum += Integer.parseInt(str[i]);
        }
        return sum;
    }

    //이진수 더하기
    public String solution10(String bin1, String bin2) {
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        String sumBinary = Integer.toBinaryString(sum);

        return sumBinary;
    }
    //TODO : 이렇게 하지 말고 직접 이진수로 바꿀 방법이 있나 찾아보기
    /*public String solution10(String bin1, String bin2) {
        int c = 0; //덧셈할 때 올라가는 수
        StringBuilder sb1 = new StringBuilder(bin1);
        StringBuilder sb2 = new StringBuilder(bin2);
        bin1 = sb1.reverse().toString();
        bin2 = sb2.reverse().toString();
        int i=0; //인덱스
        String str = "";
        //둘 다 0일 경우에
        if (bin1=="0" && bin2=="0") return "0";
        //자릿수 맞춰주기
        if (bin1.length() >= bin2.length()) {
            bin1 = bin1 + "0" + "0";
            for (int j=0; j<bin1.length()-bin2.length()+2; ++j) {
                bin2 = bin2 + "0";
            }
        } else {
            bin2 = bin2 + "0" + "0";
            for (int j=0; j<bin2.length()-bin1.length()+2; ++j) {
                bin1 = bin1 + "0";
            }
        }
        //더하기
        while (bin1.length() > i) {
            int num1 = Integer.parseInt(String.valueOf(bin1.charAt(i)));
            int num2 = Integer.parseInt(String.valueOf(bin2.charAt(i)));
            int result = num1 + num2 + c;
            if (num1 + num2 + c > 1) {
                result = result - 2;
                c = 1;
            } else {
                c = 0;
            }
            str = result + str;
            ++i;
        }
        i=0; //다시 쓰려고
        // 앞에 붙은 0 제거
        while (str.charAt(i) != '1') {
            str = str.replaceFirst("0", " ");
            ++i;
        }
        return str.trim();
    }*/

    //한 번만 등장한 문자
    public String solution9(String s) {
        int len = s.length();
        for (int i=0; i<len; ++i) {
            for (int j=i; j<len; ++j) {
                if (i==j) continue;
                if (s.charAt(i) == s.charAt(j)) {
                    s= s.replaceAll(String.valueOf(s.charAt(i)), " ");
                }
            }
        }
        s = s.replaceAll(" ", "");
        System.out.println(s);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String str = "";
        for (int i=0; i<arr.length; ++i) {
            str += arr[i];
        }
        return str;
    }

    //숨어있는 숫자의 덧셈 (2)
    public int solution8(String my_string) {
        String res = my_string.replaceAll("[a-zA-Z]", " ")
                                .replaceAll("\\s+", " ")
                                .trim();
        if (res.length() == 0) return 0;
        Integer[] numbers = Stream.of(res.split(" "))
                                .mapToInt(Integer::parseInt)
                                .boxed()
                                .toArray(Integer[]::new);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    //진료순서 정하기
    public int[] solution7(int[] emergency) {
        int len = emergency.length;
        int[] copyArr = new int[len];
        System.arraycopy(emergency, 0, copyArr, 0, len);
        Arrays.sort(copyArr);
        reverseArrayInPlace(copyArr);
        for (int i=0; i<len; ++i) {
            for (int j=0; j<len; ++j) {
                if (emergency[i] == copyArr[j]) {
                    emergency[i] = j+1;
                    break;
                }
            }
        }
        return emergency;
    }

    public void reverseArrayInPlace(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    //가까운 수
    public int solution6(int[] array, int n) {
        Arrays.sort(array);
        int num = Integer.MAX_VALUE;
        int res = 0;
        for (int i=array.length-1; i>=0; --i) {
            if (Math.abs(n-array[i]) <= num) {
                num = Math.abs(n-array[i]);
                res = array[i];
            }
        }
        return res;
    }

    //k의 개수
    public int solution5(int i, int j, int k) {
        int count = 0;
        for (int m=i; m<=j; ++m) {
            int num = m;
            while (num > 0) {
                if (num%10 == k) ++count;
                num /= 10;
            }
        }
        return count;
    }

    //2차원으로 만들기
    public int[][] solution4(int[] num_list, int n) {
        int len = num_list.length;
        int count = 0;
        int[][] answer = new int[len/n][n];
        for (int i=0; i<len/n; ++i) {
            for ( int j=0; j<n; ++j) {
                answer[i][j] = num_list[count++];
            }
        }
        return answer;
    }

    //팩토리얼
    public int solution3(int n) {
        int result = 1;
        for (int i=1; i<12; ++i) {
            result *= i;
            if (result > n) return --i;
        }
        return 0;
    }

    //A로 B 만들기
    public int solution2(String before, String after) {

        for (int i=0; i<before.length(); ++i) {
            if (after.indexOf(before.charAt(i)) == -1) return 0;
            after = after.replaceFirst(Character.toString(before.charAt(i)), "-");
        }
        return 1;
    }

    //모스부호 (1)
    public String solution1(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letters = letter.split(" ");
        String str = "";

        for (int i=0; i<letters.length; ++i) {
            str += (char)(97 + Arrays.asList(morse).indexOf(letters[i]));
        }
        return str;
    }
}
