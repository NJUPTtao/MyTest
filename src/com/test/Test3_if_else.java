package com.test;

import java.util.Scanner;

/**
 * ClassName:test3
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/5--17:58
 */
public class Test3_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入狗的年龄：");
        int dog_age = sc.nextInt();
        double age = 0.0;
        if (dog_age < 0){
            System.out.println("小狗年龄不能为负数");
        } else if (dog_age >= 0 && dog_age <= 2) {
                age = dog_age * 10.5;
        } else {
            age = 10.5 * 2 + (dog_age - 2) * 4;
        }
        System.out.println("小狗的年龄为："+age);
    }
}
