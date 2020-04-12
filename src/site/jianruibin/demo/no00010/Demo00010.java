/* Demo00010.java 2020/04/12 13:42:23 Copyright (c) 见瑞彬 All Rights Reserved. */

package site.jianruibin.demo.no00010;

import java.util.Scanner;

/**
 * <pre>
 * Demo00010 实现两个变量的互换（不借助第3个变量）
 * </pre>
 * @date: 2020/04/12 13:42:23
 * @author 见瑞彬
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00010 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// 创建扫描器
        System.out.println("请输入变量A的值");
        long A = scan.nextLong();// 接收第一个变量值
        System.out.println("请输入变量B的值");
        long B = scan.nextLong();// 接收第二个变量值
        System.out.println("A=" + A + "\tB=" + B);
        System.out.println("执行变量互换...");
        A = A ^ B;// 执行变量互换
        B = A ^ B;
        A = A ^ B;
        System.out.println("A=" + A + "\tB=" + B);
        scan.close();
    }
}
