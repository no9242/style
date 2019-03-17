public abstract class aboutAbstract {

    aboutAbstract(String... P) {
        //...
    }

    //抽象方法,继承者必须实现
    abstract void run();

    //继承的方法
    @Override
    public String toString() {
        return "aboutAbstract";
    }
}
