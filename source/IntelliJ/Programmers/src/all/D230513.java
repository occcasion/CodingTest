package all;

import java.util.Scanner;
import java.util.stream.Stream;

public class D230513 {


    // JadenCase 문자열 만들기
    // 끝에 공백이 오는 경우 해결하기
    public String solution3(String s) {
        String str = "";
        String[] arr = s.split(" ");

        for (int i=0; i<arr.length; ++i) {
            if (arr[i].equals("")) str += " ";
            else str += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }

        return str.substring(0, str.length()-1);
    }
//    public String solution3(String s) {
//        String str = "";
//        String[] answer = s.split(" ");
//        for (int i=0; i<answer.length; ++i) {
//            if (i==answer.length-1) {
//                str += changeCase(answer[i]);
//                if (answer[i].equals("")) str += " ";
//                continue;
//            }
//            str += changeCase(answer[i]) + " ";
//        }
//        return str;
//    }
//
//    public String changeCase(String s) {
//        String str = "";
//        for (int i=0; i<s.length(); ++i) {
//            if (i==0) {
//                str += s.charAt(i);
//                str = str.toUpperCase();
//                continue;
//            }
//            String lowerStr = "";
//            lowerStr += s.charAt(i);
//            str += lowerStr.toLowerCase();
//        }
//        return str;
//    }

    // 직사각형 별찍기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=0; i<b; ++i) {
            for (int j=0; j<a; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 행렬의 덧셈
    public int[][] solution1(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i=0; i<arr1.length; ++i) {
            for (int j=0; j<arr1[0].length; ++j) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
