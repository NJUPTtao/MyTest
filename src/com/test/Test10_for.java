package com.test;

import static java.lang.Math.pow;

/** ^
 * ClassName:Test10_for
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/15--10:18
 */
public class Test10_for {
    public static void main(String[] args) {
        for (int i = 100;i <1000;i++) {
            if (pow((i / 100),3) + pow(((i / 10) % 10),3) + pow((i % 10),3) ==i) {
                System.out.println(i);
            }
        }
    }
}
