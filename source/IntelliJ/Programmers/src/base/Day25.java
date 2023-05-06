package base;

public class Day25 {

    public static void main(String[] args) {

    }

    // 이차원 배열 대각선 순회하기
    public int solution4(int[][] board, int k) {
        int sum = 0;
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (i + j <= k) sum += board[i][j];
            }
        }
        return sum;
    }

    // 정사각형으로 만들기
    public int[][] solution3(int[][] arr) {
        int newLen = arr.length > arr[0].length ? arr.length : arr[0].length;
        int[][] answer = new int[newLen][newLen];
        for (int i = 0; i < newLen; ++i) {
            for (int j = 0; j < newLen; ++j) {
                if (i > arr.length - 1 || j > arr[0].length - 1) answer[i][j] = 0;
                else answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }

    // 특별한 이차원 배열 2
    public int solution2(int[][] arr) {
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                if (i == j) continue;
                if (arr[i][j] == arr[j][i]) ++count;
            }
        }
        if (count == (len * (len-1))) return 1;
        return 0;
    }

    // 정수를 나선형으로 배치하기
    // https://school.programmers.co.kr/learn/courses/30/lessons/181832
    public int[][] solution1(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n * n; ++i) {

        }

        return new int[][]{};
    }
}
