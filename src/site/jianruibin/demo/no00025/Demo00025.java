/* Demo00025.java 2020/04/13 22:01:07 Copyright (c) 见瑞彬 All Rights Reserved. */

package site.jianruibin.demo.no00025;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * <pre>
 * Demo00025 获取一维数组最小值
 * </pre>
 * 
 * @date: 2020/04/13 22:01:07
 * @author 见瑞彬
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00025 extends JFrame implements ActionListener
{
    JTextField textField = null;
    JButton jb1 = null;
    JLabel label1, label = null;
    JPanel jp1 = null;

    /**
     * <pre>
     * 显示窗体
     * </pre>
     * 
     * @CreateDate 2020/04/13 22:09:18
     *
     */
    public void showForm()
    {
        this.setBounds(300, 400, 400, 150);
        this.setBackground(Color.DARK_GRAY);

        textField = new JTextField();

        jb1 = new JButton("计算");
        jb1.addActionListener(this);

        label1 = new JLabel("请在文本框中输入多个整数,以空格为分隔符。例如：3 5 123 4324");
        label = new JLabel();

        jp1 = new JPanel();

        this.add(label1, BorderLayout.NORTH);
        this.add(textField, BorderLayout.CENTER);
        jp1.add(jb1);
        jp1.add(label);
        this.add(jp1, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.validate();
    }

    public static void main(String[] args)
    {
        Demo00025 demo00025 = new Demo00025();
        demo00025.showForm();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jb1)
        {
            String arrayStr = textField.getText().trim();
            for (int i = 0; i < arrayStr.length(); i++)
            {// 过滤非法输入
                char charAt = arrayStr.charAt(i);
                if (!Character.isDigit(charAt) && charAt != ' ')
                {
                    JOptionPane.showMessageDialog(null, "输入包含非数字内容");
                    textField.setText("");
                    return;
                }
            }
            String[] numStrs = arrayStr.split(" {1,}");// 分割字符串
            int[] numArray = new int[numStrs.length];// 创建整数数组
            // 转换输入为整数数组
            for (int i = 0; i < numArray.length; i++)
            {
                numArray[i] = Integer.valueOf(numStrs[i]);
            }
            int min = numArray[0];// 创建最小数变量
            for (int j = 0; j < numArray.length; j++)
            {
                if (min > numArray[j])
                {// 提取最小整数
                    min = numArray[j];
                }
            }
            label.setText("数组中最小的数是：" + min);
        }
    }

}
