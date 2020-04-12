package site.jianruibin.demo.no00007;

import java.util.Scanner;

/**
 * Demo00007 用三元运算符判断奇数和偶数
 * @author 卖影人
 *
 */
public class Demo00007 {

    public static void main(String[] args) {
        /* 创建数据输入流 */
        Scanner scanner = new Scanner(System.in);

        /* 取得数据 */
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();

        /* 计算结果 */
        /* 判断奇数还是偶数 */
        String result = (num%2 == 1) ? "奇数":"偶数"; 
        System.out.println("这是一个"+result);

        scanner.close();
    }

}
