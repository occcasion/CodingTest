package base;

import java.util.Arrays;

public class Day6 {

    public static void main(String[] args) {
        System.out.println(solution5(new int[]{0, 1, 2, 4, 3}, new int[][]{{0,4,2},{0,3,2},{0,2,2}}));
    }

    //수열과 구간 쿼리 2
    public static int[] solution5(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i=0; i<answer.length; ++i) {
            answer[i] = -1;
        }
        for (int i=0; i<queries.length; ++i) {
            int count = 0;
            for (int j=queries[i][0]; j<=queries[i][1]; ++j) {
                if (arr[j] > queries[i][2]) {
                    if (count==0 || answer[i] > arr[j]) {
                        answer[i] = arr[j];
                        ++count;
                    }
                }
            }
        }

        return answer;
    }

    //수열과 구간 쿼리 3
    public int[] solution4(int[] arr, int[][] queries) {
        for (int i=0; i<queries.length; ++i) {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        return arr;
    }

    String swapArr(String query, int i, int j) {
        query = insertChar(query, query.indexOf(i), j);
        query = insertChar(query, query.indexOf(j), i);
        return query;
    }

    String insertChar(String str, int idx, int n) {
        //인덱스 idx에 n이라는 숫자 삽입하기
        String start = str.substring(0, idx);
        if (idx >= str.length()-1) return start + Integer.valueOf(n);
        String end = str.substring(idx+1);
        return start + Integer.valueOf(n) + end;
    }

    //수 조작하기 2
    public String solution3(int[] numLog) {
        String answer = "";
        for (int i=0; i<numLog.length-1; ++i) {
            switch (numLog[i+1]-numLog[i]) {
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                    break;
                case 10:
                    answer += "d";
                    break;
                case -10:
                    answer += "a";
                    break;
                default:
                    break;
            }
        }
        return answer;
    }

    //수 조작하기 1
    public int solution2(int n, String control) {
        for (int i=0; i<control.length(); ++i) {
            switch (control.charAt(i)) {
                case 'w':
                    ++n;
                    break;
                case 's':
                    --n;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
                default:
                    break;
            }
        }
        return n;
    }

    //마지막 두 원소
    public int[] solution1(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, answer,0, num_list.length);

        int last = num_list[num_list.length-1];
        int beforeLast = num_list[num_list.length-2];
        answer[num_list.length] = beforeLast<last ? last-beforeLast : last*2;

        return answer;
    }
}
