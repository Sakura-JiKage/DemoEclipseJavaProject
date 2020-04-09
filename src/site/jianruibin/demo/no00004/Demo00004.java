package site.jianruibin.demo.no00004;

/**
 * Demo00004 数据类型表示范围
 * @author 卖影人
 *
 */
public class Demo00004 {

    public static void main(String[] args) {
        boolean value_1 = Boolean.TRUE;
        
        char c = 'w';
        System.out.println("char类型的长度是："+Character.SIZE);
        
        System.out.println("\nbyte类型的最大值是："+Byte.MAX_VALUE);
        System.out.println("byte类型的最小值是："+Byte.MIN_VALUE);
        System.out.println("byte类型的长度是："+Byte.SIZE);
        
        System.out.println("\nshort类型的最大值是："+Short.MAX_VALUE);
        System.out.println("short类型的最小值是："+Short.MIN_VALUE);
        System.out.println("short类型的长度是："+Short.SIZE);
        
        System.out.println("\nint类型的最大值是："+Integer.MAX_VALUE);
        System.out.println("int类型的最小值是："+Integer.MIN_VALUE);
        System.out.println("int类型的长度是："+Integer.SIZE);
        
        System.out.println("\nlong类型的最大值是："+Long.MAX_VALUE);
        System.out.println("long类型的最小值是："+Long.MIN_VALUE);
        System.out.println("long类型的长度是："+Long.SIZE);
        
        System.out.println("\nfloat类型的最大值是："+Float.MAX_VALUE);
        System.out.println("float类型的最小值是："+Float.MIN_VALUE);
        System.out.println("float类型的长度是："+Float.SIZE);
        
        System.out.println("\ndouble类型的最大值是："+Double.MAX_VALUE);
        System.out.println("double类型的最小值是："+Double.MIN_VALUE);
        System.out.println("double类型的长度是："+Double.SIZE);
        
        System.out.println("十六进制数 0x9a："+0x9a);
        System.out.println("八进制数 0123："+0123);
        
        long a = 123L;
        System.out.println("long类型定义需要加L"+a);

        float b = 123f;
        System.out.println("float类型定义需要加f"+b);

        
    }
}
