/* Demo00011.java 2020/04/12 14:16:03 Copyright (c) 见瑞彬 All Rights Reserved. */

package site.jianruibin.demo.no00011;

import java.util.Scanner;

/**
 * <pre>
 * Demo00011 判断某一年是否为闰年
 * </pre>
 * @date: 2020/04/12 14:16:03
 * @author 见瑞彬
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00011 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        long year = scan.nextLong();// 接收用户输入
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // 是闰年
            System.out.print(year + "是闰年！");
        } else { // 不是闰年
            System.out.print(year + "不是闰年！");
        }
        scan.close();
    }
}
