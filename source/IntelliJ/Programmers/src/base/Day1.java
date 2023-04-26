package base;

import java.util.Scanner;

public class Day1 {

    //특수문자 출력하기
    public static void solution5(String[] args) {
        System.out.println("!@#$%^&*(\\'\"<>?:;");
    }

    //대소문자 바꿔서 출력하기
    public static void solution4(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for (char c : a.toCharArray()) {
            if (Character.isUpperCase(c)) result = result + Character.toLowerCase(c);
            else result = result + Character.toUpperCase(c);
        }
        System.out.println(result);
    }

    //문자열 반복해서 출력하기
    public static void solution3(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for (int i=0; i<n; ++i)
            System.out.print(str);
    }

    //a와 b 출력하기
    public static void solution2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    //문자열 출력하기
    public static void solution1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);
    }
}
