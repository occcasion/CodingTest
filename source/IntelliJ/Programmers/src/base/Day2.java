package base;

import java.util.Scanner;

public class Day2 {

    //문자열 겹쳐쓰기
    public String solution5(String my_string, String overwrite_string, int s) {
        String result = "";
        for (int i=0; i<my_string.length(); ++i) {
            if (s<=i && i<s+overwrite_string.length()) result += overwrite_string.charAt(i-s);
            else result += my_string.charAt(i);
        }
        return result;
    }

    //홀짝 구분하기
    public static void solution4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0) System.out.println(n+" is even");
        else System.out.println(n+" is odd.");
    }

    //문자열 돌리기
    public static void solution3(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i=0; i<a.length(); ++i) {
            System.out.println(a.charAt(i));
        }
    }

    //문자열 붙여서 출력하기
    public static void solution2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a+b);
    }

    //덧셈식 출력하기
    public static void solution1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));
    }
}
