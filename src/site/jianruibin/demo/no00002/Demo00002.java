package site.jianruibin.demo.no00002;

import java.util.Scanner;

/**
 * Demo00002 �ӿ���̨���������ַ�
 * @author ��Ӱ��
 *
 */
public class Demo00002 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������������֤��");
        // scan.next() ������ո�Tab���س���Ϊ�ַ�����ֹ����
        // scan.nextLine() ֻ����س���Ϊ��ֹ����
        String id = scan.nextLine();
        System.out.println("ԭ��������֤��"+(id.length())+"λ�İ�");
        scan.close();
    }

}
