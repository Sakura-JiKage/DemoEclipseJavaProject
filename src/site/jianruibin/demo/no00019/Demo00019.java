/* Demo00019.java 2020/04/13 21:16:04 Copyright (c) 见瑞彬 All Rights Reserved. */

package site.jianruibin.demo.no00019;

import java.math.BigDecimal;

/**
 * <pre>
 * Demo00019 用while循环计算1+1／2!+1／3!…1／20!
 * </pre>
 * 
 * @date: 2020/04/13 21:16:04
 * @author 见瑞彬
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00019
{

    public static void main(String[] args)
    {
        BigDecimal sum = new BigDecimal(0.0); // 和
        BigDecimal factorial = new BigDecimal(1.0); // 阶乘项的计算结果
        int i = 1; // 循环增量
        while (i <= 20)
        {
            sum = sum.add(factorial); // 累加各项阶乘的和
            ++i; // i加1
            factorial = factorial.multiply(new BigDecimal(1.0 / i)); // 计算阶乘项
        }
        System.out.println("1+1／2!+1／3!?¤?¤?¤1／20!的计算结果等于：\n" + sum);// 输出计算结果
    }

}
