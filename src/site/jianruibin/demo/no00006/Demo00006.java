package site.jianruibin.demo.no00006;

import java.util.Scanner;

/**
 * Demo00006 ���ܿ��������򵥣�λ���㣩
 * @author ��Ӱ��
 *
 */
public class Demo00006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������Ӣ���ַ���������ַ���");
        String message = scanner.nextLine();// ��ȡ�û�����
        char[] array = message.toCharArray();// ��ȡ�ַ�����
        for(int i=0;i<array.length;i++) {// �����ַ�����
            array[i] = (char)(array[i]^20000);// ��ÿ���ַ�Ԫ�ؽ����������
        }

        System.out.println("���ܻ���ܺ��ַ����ǣ�");
        System.err.println(new String(array));// �����Կ
        scanner.close();
    }
}
