package site.jianruibin.demo.no00007;

import java.util.Scanner;

/**
 * Demo00007 ����Ԫ������ж�������ż��
 * @author ��Ӱ��
 *
 */
public class Demo00007 {

    public static void main(String[] args) {
        /* �������������� */
        Scanner scanner = new Scanner(System.in);

        /* ȡ������ */
        System.out.println("������һ��������");
        int num = scanner.nextInt();

        /* ������ */
        /* �ж���������ż�� */
        String result = (num%2 == 1) ? "����":"ż��"; 
        System.out.println("����һ��"+result);

        scanner.close();
    }

}
