package com.test;

/**
 * ClassName:Test8_for
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/7--19:10
 */
public class Test8_for {
    public static void main(String[] args) {
        for (int i = 1;i <=150;i++) {
            System.out.print(i+" ");
            if (i % 3 ==0) {
                System.out.print("foo"+" ");
            }
            if (i % 5 ==0) {
                System.out.print("biz"+" ");
            }
            if (i % 7 ==0) {
                System.out.print("baz"+" ");
            }
            System.out.println();
        }
    }
}
