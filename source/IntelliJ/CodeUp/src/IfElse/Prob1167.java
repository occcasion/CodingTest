package IfElse;

import java.util.Arrays;
import java.util.Scanner;

public class Prob1167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        nums[0] = scanner.nextInt();
        nums[1] = scanner.nextInt();
        nums[2] = scanner.nextInt();
        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}
