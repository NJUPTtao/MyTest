package com.test;

import java.util.Scanner;

/**
 * ClassName:test1
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/1--19:02
 */
public class Test1_if_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int points = scan.nextInt();
        if (points == 100) {
            System.out.println("奖励一辆宝马");
        } else if((points > 80) && (points <= 99)) {
            System.out.println("奖励一台iphone xs max");
        } else if ((points >= 60) && (points <= 80)) {
            System.out.println("奖励一个iPad");
        } else {
            System.out.println("什么奖励也没有");
        }
    }
}
