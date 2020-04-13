/* Demo00017.java 2020/04/13 20:41:03 Copyright (c) 见瑞彬 All Rights Reserved. */

package site.jianruibin.demo.no00017;

/**
 * <pre>
 * Demo00017 使用for循环输出杨辉三角
 * </pre>
 * 
 * @date: 2020/04/13 20:41:03
 * @author 见瑞彬
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00017
{
    public static void main(String[] args)
    {
        int triangle[][] = new int[8][];// 创建二维数组
        // 遍历二维数组的第一层
        for (int i = 0; i < triangle.length; i++)
        {
            triangle[i] = new int[i + 1];// 初始化第二层数组的大小
            // 遍历第二层数组
            for (int j = 0; j <= triangle[i].length - 1; j++)
            {
                // 将两侧的数组元素赋值为1
                if (i == 0 || j == 0 || j == triangle[i].length - 1)
                {
                    triangle[i][j] = 1;
                } else
                {// 其它数值通过公式计算
                    triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
                }
                // 输出数组元素
                System.out.print(triangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
