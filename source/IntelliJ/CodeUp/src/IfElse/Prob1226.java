package IfElse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prob1226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> lotto = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        //당첨번호 + 보너스 번호
        for (int i=0; i<7; ++i) {
            lotto.add(scanner.nextInt());
        }

        //가지고 있는 번호
        for (int i=0; i<6; ++i) {
            numbers.add(scanner.nextInt());
        }

        int match = 0;
        int bonus = 0;
        for (int i=0; i<lotto.size()-1; ++i) {
            if (numbers.contains(lotto.get(i))) ++match;
            else if (numbers.contains(lotto.get(6))) bonus=1;
        }

        if (match==6) System.out.println("1");
        else if (match==5 && bonus==1) System.out.println("2");
        else if (match <= 2) System.out.println("0");
        else System.out.println(8-match);
    }
}
