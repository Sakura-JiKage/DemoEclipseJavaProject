/* Demo00009.java 2020/04/12 13:42:23 Copyright (c) 见瑞彬 All Rights Reserved. */

package site.jianruibin.demo.no00009;

import java.util.Scanner;

/**
 * <pre>
 * Demo00009 不用乘法运算符实现2×16
 * </pre>
 * @date: 2020/04/12 13:42:23
 * @author 见瑞彬
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数字");
        long num = scanner.nextLong();
        System.out.println("输入的数字是："+num);
        System.out.println(num+"*2的结果是："+(num<<1));
        System.out.println(num+"*4的结果是："+(num<<2));
        System.out.println(num+"*8的结果是："+(num<<3));
        System.out.println(num+"*16的结果是："+(num<<4));
        System.out.println(num+"*32的结果是："+(num<<5));
        scanner.close();
    }
}
