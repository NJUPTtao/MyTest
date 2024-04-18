package com.test;

import java.util.Scanner;

/**
 * ClassName:Test9_for
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/7--19:49
 */
public class Test9_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int m = scan.nextInt();
        System.out.println("请输入另一个数：");
        int n = scan.nextInt();

        int max_gy = 0;
        int min_gb = 0;
        int min = Math.min(m,n);
        int max = Math.max(m,n);

        for (int j = min;j >= 1;j--) {
            if (m % j == 0 &&  n % j == 0) {
                max_gy = j;
                break;
            }
        }
        System.out.println("最大公约数为："+max_gy);

        for (int k = max;k <= n*m;k++) {
            if (k % n == 0 && k % m ==0) {
                min_gb = k;
                break;
            }
        }
        System.out.println("最小公倍数为："+min_gb);
    }
}
