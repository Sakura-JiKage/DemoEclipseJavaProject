/* Demo00017.java 2020/04/13 20:41:03 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00017;

/**
 * <pre>
 * Demo00017 ʹ��forѭ������������
 * </pre>
 * 
 * @date: 2020/04/13 20:41:03
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00017
{
    public static void main(String[] args)
    {
        int triangle[][] = new int[8][];// ������ά����
        // ������ά����ĵ�һ��
        for (int i = 0; i < triangle.length; i++)
        {
            triangle[i] = new int[i + 1];// ��ʼ���ڶ�������Ĵ�С
            // �����ڶ�������
            for (int j = 0; j <= triangle[i].length - 1; j++)
            {
                // �����������Ԫ�ظ�ֵΪ1
                if (i == 0 || j == 0 || j == triangle[i].length - 1)
                {
                    triangle[i][j] = 1;
                } else
                {// ������ֵͨ����ʽ����
                    triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
                }
                // �������Ԫ��
                System.out.print(triangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
