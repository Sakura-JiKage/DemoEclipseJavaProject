package site.jianruibin.demo.no00005;

/**
 * Demo00005 �Զ�����ת����ǿ������ת��
 * 
 * @author ��Ӱ��
 *
 */
public class Demo00005 {

    public static void main(String[] args) {
        byte b = 127;
        char c = 'W';
        short s = 23561;
        int i = 3333;
        long l = 400000L;
        float f = 3.14159F;
        double d = 54.523;

        // ��������������Զ�ת��
        System.out.println("�ۼ�bype���ڣ�" + b);
        System.out.println("�ۼ�char���ڣ�" + (b + c));
        System.out.println("�ۼ�short���ڣ�" + (b + c + s));
        System.out.println("�ۼ�int���ڣ�" + (b + c + s + i));
        System.out.println("�ۼ�long���ڣ�" + (b + c + s + i + l));
        System.out.println("�ۼ�float���ڣ�" + (b + c + s + i + l + f));
        System.out.println("�ۼ�double���ڣ�" + (b + c + s + i + l + f + d));

        // �����͵������͵�ǿ��ת��
        System.out.println("��longǿ������ת��Ϊint��" + (int) l);
        // �����͵�������ת���ᶪʧ����
        System.out.println("��intǿ������ת��Ϊshort��" + (short) l);
        // ʵ��������ת��������С������
        System.out.println("��doubleǿ������ת��Ϊint��" + (int) d);
        // �������ַ����͵�ת������ȡ��Ӧ������ַ�
        System.out.println("��shortǿ������ת��Ϊchar��" + (char) s);

    }

}
