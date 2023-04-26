package basic;

import java.util.*;
import java.util.stream.Collectors;

public class Basic5 {

    public static void main(String[] args) {
    }

    //옹알이 (1)
    public int solution20(String[] babbling) {
        int count = 0;
        for (int i=0; i<babbling.length; ++i) {
            babbling[i] = babbling[i].replaceAll("aya", " ");
            babbling[i] = babbling[i].replaceAll("ye", " ");
            babbling[i] = babbling[i].replaceAll("woo", " ");
            babbling[i] = babbling[i].replaceAll("ma", " ");
            babbling[i] = babbling[i].trim();
            if (babbling[i].equals("")) ++count;
        }
        return count;
    }

    //평행
    public int solution19(int[][] dots) {
        int[] a1 = getInclin(dots[0][0], dots[0][1], dots[1][0], dots[1][1]);
        int[] b1 = getInclin(dots[2][0], dots[2][1], dots[3][0], dots[3][1]);
        int[] a2 = getInclin(dots[0][0], dots[0][1], dots[2][0], dots[2][1]);
        int[] b2 = getInclin(dots[1][0], dots[1][1], dots[3][0], dots[3][1]);
        int[] a3 = getInclin(dots[0][0], dots[0][1], dots[3][0], dots[3][1]);
        int[] b3 = getInclin(dots[1][0], dots[1][1], dots[2][0], dots[2][1]);
        if (a1[0]*b1[1] == a1[1]*b1[0] || a2[0]*b2[1] == a2[1]*b2[0] || a3[0]*b3[1] == a3[1]*b3[0]) return 1;
        return 0;
    }

    public int[] getInclin(int x1, int y1, int x2, int y2) {
        return new int[]{x1-x2, y1-y2};
    }

    //겹치는 선분의 길이
    public int solution18(int[][] lines) {
        // 0<= a < b <= 200
        int[] dots = new int[201]; //선분이 지나간 점
        for (int i=0; i<lines.length; ++i) {
            for (int j=lines[i][0]; j<lines[i][1]; ++j) {
                ++dots[j+100];
            }
        }

        int count = 0;
        for (int i=0; i<dots.length; ++i) {
            if (dots[i]>1) ++count;
        }

        return count;
    }

    //안전지대
    public int solution17(int[][] board) {
        int len = board.length;
        for (int i=0; i<len; ++i) {
            for (int j=0; j<len; ++j) {
                if (board[i][j] == 1) {
                    check(board, i, j);
                }
            }
        }
        int danger = 0;
        for (int i=0; i<len; ++i) {
            for (int j=0; j<len; ++j) {
                if (board[i][j] == 1) board[i][j] = 2; //check에서 기존에 1이었던 부분까지 2로
                if (board[i][j] == 2) {
                    //위험지대 카운트
                    ++danger;
                }
            }
        }
        return len*len-danger;
    }

    //위험지대에 2 넣기 (기존에 1이었던 부분은 제외 - 나중에 또 연관된 위험지대 체크해야 됨)
    public void check(int[][] board, int x, int y) {
        int len = board.length-1;
        for (int i=-1; i<=1; ++i) {
            for (int j=-1; j<=1; ++j) {
                if ((x+i<=len) && (y+j<=len) && (x+i>=0) && (y+j>=0)) {
                    if (board[x+i][y+j]==1) continue;
                    board[x+i][y+j] = 2;
                }
            }
        }
    }

    //연속된 수의 합
    public int[] solution16(int num, int total) {
        int addedNum = 0; // a, a+1, a+2, ... 에서 상수들의 합
        for (int i=1; i<num; ++i) {
            addedNum += i;
        }
        int startNum = (total-addedNum) / num;
        int[] answer = new int[num];
        for (int i=0; i<num; ++i) {
            answer[i] = startNum+i;
        }
        return answer;
    }

    //다음에 올 숫자
    public int solution15(int[] common) {
        boolean isArithmetic = (common[2]-common[1])==(common[1]-common[0]); //등차
        boolean isGeometric = (common[0]*common[2])==(common[1]*common[1]); //등비
        if (isArithmetic&&isGeometric) return common[0]; // {0, 0, 0, 0, ...} {1, 1, 1, 1, ...}
        else if (isArithmetic) return common[common.length-1] + (common[1]-common[0]);
        else if (isGeometric) return common[common.length-1] * common[1] / common[0];
        return 0;
    }

    //분수의 덧셈
    public int[] solution14(int numer1, int denom1, int numer2, int denom2) {
        numer1 *= denom2;
        numer2 *= denom1;
        int numer = numer1 + numer2;
        int denom = denom1 * denom2;
        int gcd = 0;
        for (int i=1; i<=Math.min(numer, denom); ++i) {
            if (numer%i==0 && denom%i==0) gcd = i;
        }

        return new int[]{numer/gcd, denom/gcd};
    }

    //OX퀴즈
    public String[] solution13(String[] quiz) {
        int len = quiz.length;
        String[] answer = new String[len];
        String[] sentence = new String[5];
        for (int i=0; i<len; ++i) {
            sentence = quiz[i].split(" ");
            int num1 = Integer.parseInt(sentence[0]);
            int num2 = Integer.parseInt(sentence[2]);
            int result = Integer.parseInt(sentence[4]);
            if (sentence[1].equals("+")) {
                if ((num1+num2)==result) answer[i] = "O";
                else answer[i] = "X";
            } else {
                if ((num1-num2)==result) answer[i] = "O";
                else answer[i] = "X";
            }
        }
        return answer;
    }

    //최빈값 구하기
    public int solution12(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<array.length; ++i) {
            //키가 존재하지 않을 경우
//            if (map.containsKey(array[i])) map.put(array[i], 1);
            //키가 존재할 경우
//            else {
                map.compute(array[i], (a, b) -> (b == null) ? 1 : b + 1);
//            }
        }
        int maxValue = 0;
        int maxIndex = 0;
        Iterator<Integer> keys = map.keySet().iterator();
        for (int i=0; i<map.size(); ++i) {
            Integer key = keys.next();
            if (maxValue < map.get(key)) {
                maxValue = map.get(key);
                maxIndex = key;
            } else if (maxValue == map.get(key)) {
                maxIndex = -1;
            }

            System.out.println("maxValue = " + maxValue);;
            System.out.println("maxIndex = " + maxIndex);
        }
        return maxIndex;
    }
    /*public int solution12(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<1001; ++i) {
            list.add(i, 0);
        }
        for (int i=0; i<array.length; ++i) {
            list.add(array[i], 1 + list.get(array[i]));
            System.out.println(i + " = " + list.get(i));
        }
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.indexOf(Collections.max(list)));
        if (list.indexOf(Collections.max(list)) == 0) return -1;
        return list.indexOf(Collections.max(list));
    }*/

    //다항식 더하기
    public String solution11(String polynomial) {
        String[] elm = polynomial.split(" ");
        int xNum = 0;
        int constNum = 0;
        for (int i=0; i<elm.length; ++i) {
            if (elm[i].contains("x")) {
                if (elm[i].replace("x", "").equals("")) {
                    ++xNum;
                    continue;
                }
                xNum += Integer.parseInt(elm[i].replace("x", ""));
            }
            else if (elm[i].equals("+")) continue;
            else constNum += Integer.parseInt(elm[i]);
        }
        if (constNum == 0 && xNum != 1) return String.valueOf(xNum) + "x";
        if (constNum == 0 && xNum == 1) return "x";
        if (xNum != 0 && xNum != 1) return String.valueOf(xNum)+ "x + " + String.valueOf(constNum);
        if (xNum != 0 && xNum == 1) return "x + " + String.valueOf(constNum);
        return String.valueOf(constNum);
    }

    //문자열 밀기
    public int solution10(String A, String B) {
        for (int i=0; i<A.length(); ++i) {
            if (A.equals(B)) return i;
            A = A.charAt(A.length()-1) + A;
            System.out.println(A);
            A = A.substring(0, A.length()-1);
            System.out.println(A);
        }
        return -1;
    }

    //특이한 정렬
    public int[] solution9(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        List<Integer> num = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        int btw1 = Math.abs(Collections.max(num)-n);
        int btw2 = Math.abs(Collections.min(num)-n);
        int between = Math.max(btw1, btw2);
        for (int i=0; i<=between; ++i) {
            if (i==0) {
                if (num.contains(n))
                    list.add(n);
            } else {
                if (num.contains(n+i)) list.add(n+i);
                if (num.contains(n-i)) list.add(n-i);
            }
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //저주의 숫자 3
    public int solution8(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<=200; ++i) {
            if (i%3==0||i%10==3||(i/10)%10==3) continue;
            list.add(i);
        }

        return list.get(n-1);
    }

    //유한소수 판별하기
    //약분 주의하기
    public int solution7(int a, int b) {
        int gcd = 1;
        for (int i=2; i<=Math.min(a, b); ++i) {
            if (a%i==0 && b%i==0) gcd = i;
        }
        b/=gcd;

        while (b%2==0) b/=2;
        while (b%5==0) b/=5;

        if (b==1) return 1;
        return 2;
    }

    //등수 매기기
    //한 번 더 보기
    public int[] solution6(int[][] score) {
        int len = score.length;
        int[] rank = new int[len];
        int[] sumSort = new int[len];
        for (int i=len-1; i>=0; --i) {
            rank[i] = score[i][0] + score[i][1];
            sumSort[i] = score[i][0] + score[i][1];
        }
        Arrays.sort(sumSort);
        // reverse
        for (int i = 0; i < len / 2; i++) {
            int temp = sumSort[i];
            sumSort[i] = sumSort[len - 1 - i];
            sumSort[len - 1 - i] = temp;
        }
        int ranks = 0;
        List<Integer> checked = new ArrayList<>(); // 이미 등수 채워넣은 인덱스 체크용
        for (int i=0; i<len; ++i) {
            for (int j=0; j<len; ++j) {
                //이미 등수로 채워 넣은 칸 확인하기
                if (checked.contains(j)) continue;
                // 제일 큰 점수일 때
                if (sumSort[0]==rank[j] && i==0) {
                    checked.add(j);
                    rank[j] = 1;
                    ranks = 1;
                    break;
                }
                else if (sumSort[0]!=rank[j] && i==0) continue;
                else {
                    //현재 점수가 이전 점수와 같을 때
                    if (sumSort[i] == sumSort[i-1]) {
                        if (sumSort[i] == rank[j]) {
                            checked.add(j);
                            rank[j] = ranks;
                            break;
                        }
                    }
                    // 현재 점수가 이전 점수와 다를 때
                    else {
                        if (sumSort[i] == rank[j]) {
                            checked.add(j);
                            rank[j] = i+1;
                            ranks = i+1;
                            break;
                        }
                    }
                }
            }
        }
        return rank;
    }

    //치킨 쿠폰
    public int solution5(int chicken) {
        int maxChick = 0;
        while (chicken > 0) {
            maxChick += chicken/10;
            chicken = chicken/10 + chicken%10;
            if (chicken < 10) {
                break;
            }
        }
        return maxChick;
    }

    //로그인 성공?
    public String solution4(String[] id_pw, String[][] db) {
        String answer = "";
        for (int i=0; i<db.length; ++i) {
            if (id_pw[0].equals(db[i][0])) {
                for (int j=0; j<db.length; ++j) {
                    if (id_pw[1].equals(db[i][1])) return "login";
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }

    //종이 자르기
    public int solution3(int M, int N) {
        return M*N - 1;
    }

    //캐릭터의 좌표
    public int[] solution2(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for (int i=0; i<keyinput.length; ++i) {
            switch (keyinput[i]) {
                case "left":
                    answer[0] -= 1;
                    answer = limit(answer, board);
                    break;
                case "right":
                    answer[0] += 1;
                    answer = limit(answer, board);
                    break;
                case "up":
                    answer[1] += 1;
                    answer = limit(answer, board);
                    break;
                case "down":
                    answer[1] -= 1;
                    answer = limit(answer, board);
                    break;
                default:
                    break;
            }
            System.out.println("answer[0] = " + answer[0]);
            System.out.println("answer[1] = " + answer[1]);
        }
        return answer;
    }

    public int[] limit(int[] pos, int[] limitNum) {
        int limitWidth = limitNum[0]/2;
        int limitHeight = limitNum[1]/2;
        if (pos[0] > limitWidth) pos[0] = limitWidth;
        if (pos[0] < -limitWidth) pos[0] = -limitWidth;
        if (pos[1] > limitHeight) pos[1] = limitHeight;
        if (pos[1] < -limitHeight) pos[1] = -limitHeight;
        return pos;
    }

    //직사각형 넓이 구하기
    public int solution1(int[][] dots) {
        int x1 = dots[0][0];
        int x2 = 0;
        int y1 = dots[0][1];
        int y2 = 0;

        for (int i=0; i<dots.length; ++i) {
            if (dots[i][0] != x1) x2 = dots[i][0];
            if (dots[i][1] != y1) y2 = dots[i][1];
        }
        return Math.abs((x1-x2)*(y1-y2));
    }
}
