/* Demo00024.java 2020/04/13 21:46:26 Copyright (c) 见瑞彬 All Rights Reserved. */

package site.jianruibin.demo.no00024;

/**
 * <pre>
 * Demo00024 循环的极限
 * </pre>
 * 
 * @date: 2020/04/13 21:46:26
 * @author 见瑞彬
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00024
{

    public static void main(String[] args)
    {
        int end = Integer.MAX_VALUE;// 定义循环终止数
        int start = end - 50;// 定义循环起始数
        int count = 0;// 定义循环计数器
        for (int i = start; i <= end; i++)
        {// 执行循环
            count++;// 循环计数
        } // i 在整型数据定义范围内，不可能i <= end，会变成死循环
          // 输出循环计数器
        System.out.println("本次循环次数为：" + count);
    }

}
