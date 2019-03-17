/**
 * 继承类
 */
public class aboutClass1 extends aboutClass {

    aboutClass1(String... P) {
        //使用父类方法
        super(P);
    }

    //    方法重构
    @Override
    public void fun1() {
        super.fun1();
        super.fun5();
    }

}
