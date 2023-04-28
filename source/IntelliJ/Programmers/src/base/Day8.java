package base;

public class Day8 {

    //문자열 여러 번 뒤집기
    public String solution5(String my_string, int[][] queries) {
        String start = "";
        String end = "";
        String rev = "";
        for (int i=0; i<queries.length; ++i) {
            start = my_string.substring(0, queries[i][0]);
            if (queries[i][1] != my_string.length()-1) {
                end = my_string.substring(queries[i][1]+1);
            }
            rev = my_string.substring(queries[i][0], queries[i][1]+1);
            StringBuilder sb = new StringBuilder(rev);
            rev = sb.reverse().toString();
            my_string = start + rev + end;
            start = "";
            end = "";
            rev = "";
        }
        return my_string;
    }

    //9로 나눈 나머지
    public int solution4(String number) {
        int answer = 0;
        for (int i=0; i<number.length(); ++i) {
            answer += Character.getNumericValue(number.charAt(i));
        }
        return answer%9;
    }

    //글자 이어 붙여 문자열 만들기
    public String solution3(String my_string, int[] index_list) {
        String answer = "";
        for (int i=0; i<index_list.length; ++i) {
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }

    //주사위 게임 3
    public int solution2(int a, int b, int c, int d) {
        if (a==b && b==c && c==d) return 1111*a;
        else if (a==b && b==c && c!=d) return (10*c+d) * (10*c+d);
        else if (b==c && c==d && d!=a) return (10*d+a) * (10*d+a);
        else if (c==d && d==a && a!=b) return (10*a+b) * (10*a+b);
        else if (d==a && a==b && b!=c) return (10*b+c) * (10*b+c);
        else if (a==b && c==d && b!=c) return (b+c)*Math.abs(b-c);
        else if (a==c && b==d && c!=b) return (b+c)*Math.abs(b-c);
        else if (a==d && b==c && d!=b) return (b+d)*Math.abs(b-d);
        else if (a==b && b!=c && b!=d && c!=d) return c*d;
        else if (a==c && c!=b && c!=d && b!=d) return b*d;
        else if (a==d && a!=b && a!=c && b!=c) return b*c;
        else if (b==c && c!=a && c!=d && a!=d) return a*d;
        else if (b==d && d!=a && d!=c && a!=c) return a*c;
        else if (c==d && d!=a && d!=b && a!=b) return a*b;
        else return Math.min(Math.min(a, b), Math.min(c, d));
    }

    //간단한 논리 연산
    public boolean solution1(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1||x2) && (x3||x4);
    }
}
