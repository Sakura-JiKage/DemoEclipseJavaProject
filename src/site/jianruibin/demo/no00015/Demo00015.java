/* Demo00015.java 2020/04/13 20:24:19 Copyright (c) 见瑞彬 All Rights Reserved. */

package site.jianruibin.demo.no00015;

import java.util.Scanner;

/**
 * <pre>
 * Demo00015 判断用户输入月份的季节
 * </pre>
 * @date: 2020/04/13 20:24:19
 * @author 见瑞彬
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00015
{

    public static void main(String[] args)
    {
        Scanner scann = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scann.nextInt();
        switch(month) {
            case 12:
            case 1:
            case 2:System.out.print("您输入的月份属于冬季。");break;
            case 3:
            case 4:
            case 5:System.out.print("您输入的月份属于春季。");break;
            case 6:
            case 7:
            case 8:System.out.print("您输入的月份属于夏季。");break;
            case 9:
            case 10:
            case 11:System.out.print("您输入的月份属于秋季。");break;
            default:System.out.print("你们那儿有"+month+"月吗？");
        }
        scann.close();
    }

}
