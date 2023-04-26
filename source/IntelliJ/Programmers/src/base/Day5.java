package base;

public class Day5 {

    public static void main(String[] args) {
        System.out.println(solution5(new int[]{3, 4, 5, 2, 1}));
    }

    //이어 붙인 수
    public static int solution5(int[] num_list) {
        String odd = "";
        String even = "";
        for (int i = 0; i<num_list.length; ++i) {
            if (num_list[i]%2==0) even = even + Integer.toString(num_list[i]);
            else odd = odd + Integer.toString(num_list[i]);
        }

        return Integer.valueOf(even) + Integer.valueOf(odd);
    }

    //원소들의 곱과 합
    public int solution4(int[] num_list) {
        int multi = 1;
        int sum = 0;
        for (int i=0; i<num_list.length; ++i) {
            multi *= num_list[i];
            sum += num_list[i];
        }
        return multi < sum*sum ? 1 : 0;
    }

    //주사위 게임 2
    public int solution3(int a, int b, int c) {
        if (a==b && b==c) return (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        else if (a!=b && b!=c && c!=a) return a+b+c;
        else return (a+b+c)*(a*a+b*b+c*c);
    }

    //등차수열의 특정한 항만 더하기
    public int solution2(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i=0; i<included.length; ++i) {
            if (included[i]) {
                answer += (a + i * d);
            }
        }
        return answer;
    }

    //코드 처리하기
    public String solution1(String code) {
        int mode = 0;
        String ret = "";
        for (int i=0; i<code.length(); ++i) {
            if (mode==0) {
                if (code.charAt(i)!='1'&&i%2==0) ret += code.charAt(i);
                else if (code.charAt(i)=='1') mode = Math.abs(mode-1);
            }
            else {
                if (code.charAt(i)!='1'&&i%2==1) ret += code.charAt(i);
                else if (code.charAt(i)=='1') mode = Math.abs(mode-1);
            }
        }

        return ret.equals("")?"EMPTY":ret;
    }
}
