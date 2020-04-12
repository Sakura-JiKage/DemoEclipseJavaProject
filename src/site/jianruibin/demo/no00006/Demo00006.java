package site.jianruibin.demo.no00006;

import java.util.Scanner;

/**
 * Demo00006 加密可以这样简单（位运算）
 * @author 卖影人
 *
 */
public class Demo00006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入英文字符串或解密字符串");
        String message = scanner.nextLine();// 获取用户输入
        char[] array = message.toCharArray();// 获取字符数组
        for(int i=0;i<array.length;i++) {// 遍历字符数组
            array[i] = (char)(array[i]^20000);// 对每个字符元素进行异或运算
        }

        System.out.println("加密或解密后字符串是：");
        System.err.println(new String(array));// 输出密钥
        scanner.close();
    }
}
