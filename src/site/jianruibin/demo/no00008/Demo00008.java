/* Demo00008.java 2020/04/12 13:27:34 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00008;

import java.math.BigDecimal;

/**
 * <pre>
 * Demo00008 ����ȷ��ʹ�ø�����
 * </pre>
 * @date 2020/04/12 13:27:34
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00008 {

    public static void main(String[] args) {
        /* �ֽ����� */
        double money = 2.0;
        /* ��Ʒ�۸� */
        double price = 1.1;
        /* �������� */
        double result = money - price;
        System.out.println("�Ǿ�ȷ����");
        /* ���Ϊ��0.8999999999999999 */
        System.out.println("ʣ����Ϊ��"+result);
        
        /* �ֽ����� */
        BigDecimal money1 = new BigDecimal("2");
        /* ��Ʒ�۸� */
        BigDecimal price1 = new BigDecimal("1.1");
        /* �������� */
        BigDecimal result1 = money1.subtract(price1);
        System.out.println("��ȷ����");
        /* ���Ϊ��0.9 */
        System.out.println("ʣ����Ϊ��"+result1);
    }
}
