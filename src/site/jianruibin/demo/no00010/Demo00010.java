/* Demo00010.java 2020/04/12 13:42:23 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00010;

import java.util.Scanner;

/**
 * <pre>
 * Demo00010 ʵ�����������Ļ�������������3��������
 * </pre>
 * @date: 2020/04/12 13:42:23
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00010 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// ����ɨ����
        System.out.println("���������A��ֵ");
        long A = scan.nextLong();// ���յ�һ������ֵ
        System.out.println("���������B��ֵ");
        long B = scan.nextLong();// ���յڶ�������ֵ
        System.out.println("A=" + A + "\tB=" + B);
        System.out.println("ִ�б�������...");
        A = A ^ B;// ִ�б�������
        B = A ^ B;
        A = A ^ B;
        System.out.println("A=" + A + "\tB=" + B);
        scan.close();
    }
}
