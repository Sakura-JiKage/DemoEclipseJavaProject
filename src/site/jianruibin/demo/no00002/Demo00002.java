package site.jianruibin.demo.no00002;

import java.util.Scanner;

/**
 * Demo00002 从控制台接收输入字符
 * @author 卖影人
 *
 */
public class Demo00002 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的身份证：");
        // scan.next() 以输入空格、Tab、回车作为字符串终止符。
        // scan.nextLine() 只输入回车作为终止符。
        String id = scan.nextLine();
        System.out.println("原来你的身份证是"+(id.length())+"位的啊");
        scan.close();
    }

}
