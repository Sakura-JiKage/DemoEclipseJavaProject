/* Demo00016.java 2020/04/13 20:34:36 Copyright (c) 见瑞彬 All Rights Reserved. */

package site.jianruibin.demo.no00016;

/**
 * <pre>
 * Demo00016 使用while与自增运算符循环遍历数组
 * </pre>
 * 
 * @date: 2020/04/13 20:34:36
 * @author 见瑞彬
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00016
{

    public static void main(String[] args)
    {
        String[] aves = new String[] { "黄鹂", "麻雀", "喜鹊", "鹦鹉", "乌鸦" };
        System.out.println("我的花园里有很多鸟，种类大约包括：");
        int index = 0;
        while (index < aves.length)
        {
            System.out.println(aves[index++]);
        }

    }

}
