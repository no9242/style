/**
 * 类 面向对象的开始
 */
public class aboutClass {
    int i = 1;
    int i1;

    //  常量
    final int i2 = 2;
    //  静态
    static int i3 = 3;
    //  静态常量
    final static int i4 = 4;

    //    任意可见
    public int i5 = 0;

    //    同包可见
    protected int i6 = 0;

    //    同类可见
    private int i7 = 0;

    //    构造方法
    aboutClass(String... p) {
        i1 = i + 1;
    }

    //    void 无返回
    public void fun1() {
    }

    //    返回int类型
    protected int fun2() {
        return i1;
    }

    private aboutClass fun3() {
        return this;
    }

    //    静态方法,不用new类,直接调用
    static int fun4() {
        return 123;
    }

    // 常量方法无法重写
    final int fun5(){
        return 456;
    }
}