package site.jianruibin.demo.no00003;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Demo00003 �ض��������ʵ�ֳ�����־
 * @author ��Ӱ��
 *
 */
public class Demo00003 {

    public static void main(String[] args) {
        try {
            PrintStream out = System.out;// ����ԭϵͳ�����
            PrintStream ps = new PrintStream("./src/site/jianruibin/demo/no00003/Demo00003.log");// �����ļ������
            System.setOut(ps);// �趨�µ������

            int age = 18;
            System.out.println("���䶨��ɹ�����ʼֵ��18");
            String sex = "Ů";
            System.out.println("�Ա���ɹ�����ʼֵ��Ů");
            String info = "����"+sex+"���ӣ�Ӧ����"+age+"����";
            System.out.println("������������Ϊinfo�ַ��������������ǣ�"+info);
            
            System.setOut(out);// �ָ�ԭϵͳ�����
            System.out.println("����������ϣ���鿴��־�ļ���");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
