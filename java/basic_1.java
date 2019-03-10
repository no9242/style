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
         * byte 二进制位数：8
         * 包装类：java.lang.Byte
         * 最小值：Byte.MIN_VALUE=-128
         * 最大值：Byte.MAX_VALUE=127
         */
        byte BYTE = 127;

        /**
         基本类型：short
         二进制位数：16
         包装类：java.lang.Short
         最小值：Short.MIN_VALUE=-32768
         最大值：Short.MAX_VALUE=32767
         */
        short SHORT = 32767;

        /**
         * 基本类型：int 二进制位数：32
         * 包装类：java.lang.Integer
         * 最小值：Integer.MIN_VALUE=-2147483648
         * 最大值：Integer.MAX_VALUE=2147483647
         */
        int I = 2147483647;

        /**
         * 基本类型：long 二进制位数：64
         * 包装类：java.lang.Long
         * 最小值：Long.MIN_VALUE=-9223372036854775808
         * 最大值：Long.MAX_VALUE=9223372036854775807
         * 注意书写方式在尾部加上L
         */
        long L = 9223372036854775807L;

        /**
         * 
         * 基本类型：float 二进制位数：32
         * 包装类：java.lang.Float
         * 最小值：Float.MIN_VALUE=1.4E-45
         * 最大值：Float.MAX_VALUE=3.4028235E38
         */
        float F = 3.4028235E38f;

        /**
         * 基本类型：double 二进制位数：64
         * 包装类：java.lang.Double
         * 最小值：Double.MIN_VALUE=4.9E-324
         * 最大值：Double.MAX_VALUE=1.7976931348623157E308
         */
        double D = 1.7976931348623157E308;

        /**
         * 基本类型：char 二进制位数：16
         * 包装类：java.lang.Character
         * 最小值：Character.MIN_VALUE=0
         * 最大值：Character.MAX_VALUE=65535
         * 以小括号包围的单个字符
         */
        char C = 'a';

        /**
         * 复合类型: String 二进制位数: char,char,...
         * 包装类: java.lang.String
         * 以双括号包围的字符
         */
        String string = "abcd";

        System.out.println("run is end...");
    }


}