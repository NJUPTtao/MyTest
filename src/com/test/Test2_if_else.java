package com.test;

import java.util.Scanner;
/**
 * ClassName:test2
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/1--19:11
 */
public class Test2_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = scanner.nextInt();

        System.out.println("请输入第二个数：");
        int num2 = scanner.nextInt();

        System.out.println("请输入第三个数：");
        int num3 = scanner.nextInt();

        int min,mid,max;

        if (num1 >= num2) {
            if (num3 <= num2) {
                min = num3;
                mid = num2;
                max = num1;
            } else if (num3 >= num1) {
                min = num2;
                mid = num1;
                max = num3;
            } else {
                min = num2;
                mid = num3;
                max = num1;
            }
        } else {
            if (num3 <= num1) {
                min = num3;
                mid = num1;
                max = num2;
            } else if (num3 >= num2) {
                min = num1;
                mid = num2;
                max = num3;
            } else {
                min = num1;
                mid = num3;
                max = num2;
            }
        }
        System.out.println(min+"-->"+mid+"-->"+max);
    }
}
