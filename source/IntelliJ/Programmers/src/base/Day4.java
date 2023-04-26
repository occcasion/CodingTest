package base;

public class Day4 {

    //flag에 따라 다른 값 반환하기
    public int solution5(int a, int b, boolean flag) {
        if (flag) return a+b;
        else return a-b;
    }

    //조건 문자열
    public int solution4(String ineq, String eq, int n, int m) {
        if (ineq.equals(">")) {
            if (eq.equals("=")) return n>=m?1:0;
            else return n>m?1:0;
        } else {
            if (eq.equals("=")) return n<=m?1:0;
            else return n<m?1:0;
        }
    }

    //홀짝에 따라 다른 값 반환하기
    public int solution3(int n) {
        if (n%2==1) return (n+1) * (n+1) / 4;
        else return n * (n+1) * (n+2) / 6;
    }

    //공배수
    public int solution2(int number, int n, int m) {
        boolean isN = number%n==0;
        boolean isM = number%m==0;
        return isN&&isM?1:0;
    }

    //n의 배수
    public int solution1(int num, int n) {
        return num%n==0? 1:0;
    }
}
