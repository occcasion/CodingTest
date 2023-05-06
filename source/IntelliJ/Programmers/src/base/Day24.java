package base;

public class Day24 {

    // 특별한 이차원 배열 1
    public int[][] solution5(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i==j) answer[i][j] = 1;
                else answer[i][j] = 0;
            }
        }
        return answer;
    }

    //l로 만들기
    public String solution4(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); ++i) {
            if (myString.charAt(i) < 'l') answer += 'l';
            else answer += myString.charAt(i);
        }
        return answer;
    }

    // 그림 확대
    public String[] solution2(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for (int i = 0; i < picture.length*k; ++i) {
            answer[i] = "";
            for (int j = 0; j < picture[i/k].length(); ++j) {
                for (int n = 0; n < k; ++n) {
                    answer[i] += picture[i/k].charAt(j);
                }

            }
        }
        return answer;
    }

    // 커피 심부름
    public int solution1(String[] order) {
        int sum = 0;
        for (int i = 0; i < order.length; ++i) {
            if (order[i].contains("cafelatte")) sum += 5000;
            else sum += 4500;
        }
        return sum;
    }
}
