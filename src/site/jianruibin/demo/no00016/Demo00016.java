/* Demo00016.java 2020/04/13 20:34:36 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00016;

/**
 * <pre>
 * Demo00016 ʹ��while�����������ѭ����������
 * </pre>
 * 
 * @date: 2020/04/13 20:34:36
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00016
{

    public static void main(String[] args)
    {
        String[] aves = new String[] { "���", "��ȸ", "ϲȵ", "����", "��ѻ" };
        System.out.println("�ҵĻ�԰���кܶ��������Լ������");
        int index = 0;
        while (index < aves.length)
        {
            System.out.println(aves[index++]);
        }

    }

}
