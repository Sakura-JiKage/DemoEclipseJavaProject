/* Demo00024.java 2020/04/13 21:46:26 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00024;

/**
 * <pre>
 * Demo00024 ѭ���ļ���
 * </pre>
 * 
 * @date: 2020/04/13 21:46:26
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00024
{

    public static void main(String[] args)
    {
        int end = Integer.MAX_VALUE;// ����ѭ����ֹ��
        int start = end - 50;// ����ѭ����ʼ��
        int count = 0;// ����ѭ��������
        for (int i = start; i <= end; i++)
        {// ִ��ѭ��
            count++;// ѭ������
        } // i ���������ݶ��巶Χ�ڣ�������i <= end��������ѭ��
          // ���ѭ��������
        System.out.println("����ѭ������Ϊ��" + count);
    }

}
