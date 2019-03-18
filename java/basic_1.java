import java.util.List;
import java.util.ArrayList;

class basic_1 {
    /**
     * 常量,初始化后不可以被修改
     */
    final String str1 = "hello world";

    /**
     * 静态常量
     */
    static final String str2 = "hello world";

    /**
     * java程序入口启动function
     */
    public static void main(String[] args) {
        final String str3 = "局部常量";

        /**
         * 基本类型：int
         * 二进制位数：32
         * 包装类：java.lang.Integer
         * 最小值：Integer.MIN_VALUE=-2147483648
         * 最大值：Integer.MAX_VALUE=2147483647
         */
        int I = 2147483647;

        /**
         * 整数的2,8,16进制表达方法
         */
        I = 0B01; // 二进制 1
        I = 0b11; // 3

        I = 077; // 八进制 63

        I = 0XF; // 十六进制 15
        I = 0x10; // 16

        /**
         * byte 二进制位数：8
         * 包装类：java.lang.Byte
         * 最小值：Byte.MIN_VALUE=-128
         * 最大值：Byte.MAX_VALUE=127
         */
        byte BYTE = 127;

        /**
         * 基本类型：short
         * 二进制位数：16
         * 包装类：java.lang.Short
         * 最小值：Short.MIN_VALUE=-32768
         * 最大值：Short.MAX_VALUE=32767
         */
        short SHORT = 32767;

        /**
         * 基本类型：long
         * 二进制位数：64
         * 包装类：java.lang.Long
         * 最小值：Long.MIN_VALUE=-9223372036854775808
         * 最大值：Long.MAX_VALUE=9223372036854775807
         * 注意书写方式在尾部加上L
         */
        long L = 9223372036854775807L;

        /**
         *
         * 基本类型：float
         * 二进制位数：32
         * 包装类：java.lang.Float
         * 最小值：Float.MIN_VALUE=1.4E-45
         * 最大值：Float.MAX_VALUE=3.4028235E38
         */
        float F = 3.4028235E38f;

        /**
         * 基本类型：double
         * 二进制位数：64
         * 包装类：java.lang.Double
         * 最小值：Double.MIN_VALUE=4.9E-324
         * 最大值：Double.MAX_VALUE=1.7976931348623157E308
         */
        double D = 1.7976931348623157E308;

        /**
         * 基本类型：char 二进制位数：16 包装类：java.lang.Character 最小值：Character.MIN_VALUE=0
         * 最大值：Character.MAX_VALUE=65535 以小括号包围的单个字符
         * Java字符采用双字节Unicode编码占两个字节16位因而可用十六进制无符号的编码形式表示 表现形式是\\un，其中n为16位十六进制数
         * 所以'A'字符也可以用Unicode编码'\u0041'表示
         * 如果对字符编码感兴趣可以到维基百科（https://zh.wikipedia.org/wiki/Unicode字符列表）查询。
         */
        Character C = 'a';
        C = '\u0041';

        /**
         * 复合类型: String
         * 二进制位数: char,char,...
         * 包装类: java.lang.String
         * 以双括号包围的字符
         */
        String string = "abcd";

        /**
         * 布尔类型 过于常见,略过...
         */
        boolean isTrue = true;

        /**
         * 类型转换
         * 小括号声明方式转换
         * 或者用包装类的方法转换
         */
        F = (float) I;
        F = (float) C;

        /**
         * 运算符
         * 逻辑运算符
         * 跳过
         */

        /**
         * 字符串使用入门
         * StringBuilder 速度最快,非线程安全,多线程不能同步访问
         * StringBuffer 线程安全,通用性最高
         * 注意:直接操作String是效率最低的
         */
        StringBuilder str4 = new StringBuilder();
        StringBuffer str5 = new StringBuffer();

        for (int i = 0; i < 200; i++) {
            // 是否有效字符
            if (Character.isLetter(i)) {
                str5.append((char) i);
            }
        }
        // str5 ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzªµºÀÁÂÃÄÅÆÇ

        /**
         * 数组 [I@15db9742
         */
        // int[] iArr = new int[1]; //or
        int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // char[] cArr = new char[10]; //or
        char[] cArr = {'你', '还', '好', '吗'};

//        aboutFanshe.run();


        // try catch 错误捕获
        try {
            aboutThrow();
            int i = 1 / 0;
        } catch (Exception e) {
            System.out.println(e);
            //手动中断程序
            return;
        }

        System.out.println("end...");
    }

    //声明将会抛出异常
    private static void aboutThrow() throws Exception{
        //自定义一个异常
        throw new Exception("自定义异常中断");
    }
}