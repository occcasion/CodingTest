package all;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class D230514 {


    // 올바른 괄호
    // ArrayList보다 Stack이 효율적이다.
    boolean solution3(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<s.length(); ++i) {
            if (s.charAt(i)=='(') stack.push(0);
            else {
                if (stack.size()==0) return false;
                else stack.pop();
            }
        }

        return stack.size()==0;
    }

    // 최솟값 만들기
    public int solution2(int []A, int []B) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    // 최대공약수와 최소공배수
    public int[] solution1(int n, int m) {
        int[] answer = new int[2];
        answer[0] = getGCD(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }

    public int getGCD(int n, int m) {
        for (int i=Math.min(n, m); i>=1; --i) {
            if (n%i==0 && m%i==0) return i;
        }
        return 1;
    }

    public int getLCM(int n, int m) {
        int count = 1;
        int big = Math.max(n, m);
        int small = Math.min(n, m);
        while (big % small != 0) {
            big *= count++;
        }
        return big;
    }
}
