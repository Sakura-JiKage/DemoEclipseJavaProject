/* Demo00018.java 2020/04/13 21:14:20 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00018;

/**
 * <pre>
 * Demo00018 ʹ��Ƕ��ѭ���ڿ���̨������žų˷���
 * </pre>
 * 
 * @date: 2020/04/13 21:14:20
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00018
{

    public static void main(String[] args)
    {
        for (int i = 1; i <= 9; i++)
        {// ѭ�����Ʊ�����1������9
            for (int j = 1; j <= i; j++)
            {// �ڶ���ѭ�����Ʊ������һ������������
                // �����������������
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();// �����ѭ���л���
        }
    }

}
