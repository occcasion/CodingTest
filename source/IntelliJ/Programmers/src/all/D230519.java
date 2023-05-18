package all;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class D230519 {

    public static void main(String[] args) {
        String s = "";
        System.out.println(s.substring(0,0));
        String[] words = new String[]{"hello", "one", "even", "never", "now", "world", "raw"};
//        System.out.println(solution(10, 2));
    }

    // 카펫
    public static int[] solution3(int brown, int yellow) {
        int[] answer = new int[2];

        for (int i=1; i<=yellow; ++i) {
            if (yellow%i == 0) {
                if ((brown-4)/2-i == yellow/i) {
                    answer[0] = Math.max(i+2, yellow/i+2);
                    answer[1] = Math.min(i+2, yellow/i+2);
                }
            }
        }

        return answer;
    }

    // 영어 끝말잇기
    public static int[] solution2(int n, String[] words) {
        int[] answer = new int[2];
        List<String> appear = new ArrayList<>();
        for (int i=0; i<words.length; ++i) {
            if (appear.contains(words[i])) {
                answer[0] = i%n + 1;
                answer[1] = i/n + 1;
                return answer;
            }
            else if (i< words.length-1 && words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)) {
                answer[0] = (i+1)%n + 1;
                answer[1] = (i+1)/n + 1;
                return answer;
            }
            appear.add(words[i]);
        }

        return answer;
    }

    // 짝지어 제거하기
    // stack으로 다시 풀었다 -> 여전히 효율성 테스트 케이스 실패
    public static int solution1(String s) {
        Stack<String> stack = new Stack<>();
        while (!s.isEmpty()) {
            if (stack.isEmpty()) {
                stack.push(Character.toString(s.charAt(0)));
                s = s.substring(1);
                continue;
            }
            else if (stack.peek().equals(Character.toString(s.charAt(0)))) {
                s = s.substring(1);
                stack.pop();
            }
            else {
                stack.push(Character.toString(s.charAt(0)));
                s = s.substring(1);
            }
        }

        if (stack.isEmpty()) return 1;
        else return 0;
    }
//    public static int solution(String s) {
//        while (!s.isEmpty()) {
//            for (int i=0; i<s.length()-1; ++i) {
//                if (s.charAt(i) == s.charAt(i+1)) {
//                    String front = "", rear = "";
//                    front = s.substring(0, i);
//                    if (i==s.length()-1) {
//                        s = front;
//                        continue;
//                    }
//                    rear = s.substring(i+2, s.length());
//                    s = front + rear;
//
//                    break;
//                }
//                if (i==s.length()-2) return 0;
//            }
//        }
//        return 1;
//    }
}
