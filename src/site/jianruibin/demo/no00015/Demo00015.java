/* Demo00015.java 2020/04/13 20:24:19 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00015;

import java.util.Scanner;

/**
 * <pre>
 * Demo00015 �ж��û������·ݵļ���
 * </pre>
 * @date: 2020/04/13 20:24:19
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00015
{

    public static void main(String[] args)
    {
        Scanner scann = new Scanner(System.in);
        System.out.println("�������·ݣ�");
        int month = scann.nextInt();
        switch(month) {
            case 12:
            case 1:
            case 2:System.out.print("��������·����ڶ�����");break;
            case 3:
            case 4:
            case 5:System.out.print("��������·����ڴ�����");break;
            case 6:
            case 7:
            case 8:System.out.print("��������·������ļ���");break;
            case 9:
            case 10:
            case 11:System.out.print("��������·������＾��");break;
            default:System.out.print("�����Ƕ���"+month+"����");
        }
        scann.close();
    }

}
