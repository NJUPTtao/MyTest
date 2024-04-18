package com.test;

import java.util.Scanner;

/**
 * ClassName:Test6_switch_case
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/7--13:49
 */
public class Test6_switch_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入月份:");
        int month = scan.nextInt();
        System.out.println("请输入天数:");
        int day = scan.nextInt();
        int sum_day = 0;
        switch(month) {
            case 12:
                sum_day += 30;
            case 11:
                sum_day += 31;
            case 10:
                sum_day += 30;
            case 9:
                sum_day += 31;
            case 8:
                sum_day += 31;
            case 7:
                sum_day += 30;
            case 6:
                sum_day += 31;
            case 5:
                sum_day += 30;
            case 4:
                sum_day += 31;
            case 3:
                sum_day += 29;
            case 2:
                sum_day += 31;
            case 1:
                sum_day += day;
          }
          System.out.println("2024年"+month+"月"+day+"日是2024年的第"+sum_day+"天");
      }
}
