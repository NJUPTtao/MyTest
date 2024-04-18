package com.test;

import java.util.Scanner;

/**
 * ClassName:Test4_switch_case
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/7--13:00
 */
public class Test4_switch_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符：");
        String myChar = scan.next();
        char ch = myChar.charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
