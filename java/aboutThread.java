import java.time.format.DateTimeFormatter;

/**
 * 基本线程使用, 继承Thread, run里逻辑代码;
 */
public class aboutThread extends Thread {
    private int i;
    aboutThread(int i){
        this.i = i;
    }

    @Override
    public void run() {
        try {
            sleep(1000 * i);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(i);
    }
}

/**
 * 继承runnable接口也是一种方法,除了结构不同其他相同
 * new Thread(new aboutRunnable()).start();
 */
class aboutRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(2);
    }
}