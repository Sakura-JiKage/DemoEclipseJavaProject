/* Demo00001.java 2020/04/13 22:02:05 Copyright (c) 见瑞彬 All Rights Reserved. */

package site.jianruibin.demo.no00001;

/**
 * <pre>
 * Demo00001 输出错误信息与调试信息
 * </pre>
 * 
 * @date: 2020/04/13 22:02:05
 * @author 见瑞彬
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00001
{

    public static void main(String[] args)
    {
        System.out.println("程序开始运行了。");
        System.err.println("在运行期间手动输出一个错误信息：");
        System.err.println("\t该软件没有买保险，请注意安全。");
        System.out.println("Demo00001.main()");
        System.out.println("main()方法运行结束。");
    }

}
