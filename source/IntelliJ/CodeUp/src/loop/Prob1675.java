package loop;

import java.util.Scanner;

public class Prob1675 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String answer = "";

        for (int i=0; i<str.length(); ++i) {
            if (str.charAt(i) == ' ')  {
                answer += " ";
                continue;
            }
            int c = str.charAt(i) - 3;
            if (c > 122) c -= 26;
            if (c < 97) c += 26;
            answer += Character.toString((char)c);
        }

        System.out.println(answer);
    }
}
