package site.jianruibin.demo.no00003;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Demo00003 重定向输出流实现程序日志
 * @author 卖影人
 *
 */
public class Demo00003 {

    public static void main(String[] args) {
        try {
            PrintStream out = System.out;// 保存原系统输出流
            PrintStream ps = new PrintStream("./src/site/jianruibin/demo/no00003/Demo00003.log");// 创建文件输出流
            System.setOut(ps);// 设定新的输出流

            int age = 18;
            System.out.println("年龄定义成功，初始值是18");
            String sex = "女";
            System.out.println("性别定义成功，初始值是女");
            String info = "这是"+sex+"孩子，应该有"+age+"岁了";
            System.out.println("整合两个变量为info字符串变量，其结果是："+info);
            
            System.setOut(out);// 恢复原系统输出流
            System.out.println("程序运行完毕，请查看日志文件。");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
