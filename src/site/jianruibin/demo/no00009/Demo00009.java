/* Demo00009.java 2020/04/12 13:42:23 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00009;

import java.util.Scanner;

/**
 * <pre>
 * Demo00009 ���ó˷������ʵ��2��16
 * </pre>
 * @date: 2020/04/12 13:42:23
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����һ������");
        long num = scanner.nextLong();
        System.out.println("����������ǣ�"+num);
        System.out.println(num+"*2�Ľ���ǣ�"+(num<<1));
        System.out.println(num+"*4�Ľ���ǣ�"+(num<<2));
        System.out.println(num+"*8�Ľ���ǣ�"+(num<<3));
        System.out.println(num+"*16�Ľ���ǣ�"+(num<<4));
        System.out.println(num+"*32�Ľ���ǣ�"+(num<<5));
        scanner.close();
    }
}
