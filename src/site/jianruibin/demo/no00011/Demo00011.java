/* Demo00011.java 2020/04/12 14:16:03 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00011;

import java.util.Scanner;

/**
 * <pre>
 * Demo00011 �ж�ĳһ���Ƿ�Ϊ����
 * </pre>
 * @date: 2020/04/12 14:16:03
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00011 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������һ����ݣ�");
        long year = scan.nextLong();// �����û�����
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // ������
            System.out.print(year + "�����꣡");
        } else { // ��������
            System.out.print(year + "�������꣡");
        }
        scan.close();
    }
}
