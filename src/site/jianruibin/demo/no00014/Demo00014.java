/* Demo00014.java 2020/04/12 18:18:50 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00014;

/**
 * <pre>
 * Demo00014 ��switch���������ѽ������ۿ�
 * </pre>
 * 
 * @date: 2020/04/12 18:18:50
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00014
{

    public static void main(String[] args)
    {
        float money = 1206; // ���
        float rebate = 0f; // �ۿ�
        if (money > 200)
        {
            int grade = (int) money / 200; // �ȼ�
            switch (grade)
            { // ���ݵȼ������ۿ۱���
                case 1:
                    rebate = 0.95f;
                    break;
                case 2:
                    rebate = 0.90f;
                    break;
                case 3:
                    rebate = 0.85f;
                    break;
                case 4:
                    rebate = 0.83f;
                    break;
                case 5:
                    rebate = 0.80f;
                    break;
                case 6:
                    rebate = 0.78f;
                    break;
                case 7:
                    rebate = 0.75f;
                    break;
                case 8:
                    rebate = 0.73f;
                    break;
                case 9:
                    rebate = 0.70f;
                    break;
                case 10:
                    rebate = 0.65f;
                    break;
                default:
                    rebate = 0.60f;
            }
        }
        System.out.println("�����ۼ����ѽ��Ϊ��" + money);// ������ѽ��
        System.out.println("��������" + rebate + "���Żݣ�"); // ����ۿ۱���
    }

}
