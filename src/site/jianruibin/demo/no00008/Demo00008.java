/* Demo00008.java 2020/04/12 13:27:34 Copyright (c) 见瑞彬 All Rights Reserved. */

package site.jianruibin.demo.no00008;

import java.math.BigDecimal;

/**
 * <pre>
 * Demo00008 更精确的使用浮点数
 * </pre>
 * @date 2020/04/12 13:27:34
 * @author 见瑞彬
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00008 {

    public static void main(String[] args) {
        /* 现金数额 */
        double money = 2.0;
        /* 商品价格 */
        double price = 1.1;
        /* 减法运算 */
        double result = money - price;
        System.out.println("非精确计算");
        /* 结果为：0.8999999999999999 */
        System.out.println("剩余金额为："+result);
        
        /* 现金数额 */
        BigDecimal money1 = new BigDecimal("2");
        /* 商品价格 */
        BigDecimal price1 = new BigDecimal("1.1");
        /* 减法运算 */
        BigDecimal result1 = money1.subtract(price1);
        System.out.println("精确计算");
        /* 结果为：0.9 */
        System.out.println("剩余金额为："+result1);
    }
}
