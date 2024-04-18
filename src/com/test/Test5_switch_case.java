package com.test;

import java.util.Scanner;

/**
 * ClassName:Test5_switch_case
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/7--13:20
 */
public class Test5_switch_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = scan.nextInt();
        int score_1 = score / 60;
        switch (score_1) {
            case 0:
                System.out.println("不合格");
                break;
            case 1:
                System.out.println("合格");
                break;
        }
    }
}
