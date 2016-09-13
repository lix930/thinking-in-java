/**
 * 使用Runnable接口比较方便
 * <p>
 * Created by fish-Xiang on 2016/9/13.
 */
public class TestThread1 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("------------Thread :" + i);
        }
    }
}


class Runner1 implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<1000; i++) {
            System.out.println("Runner1 :" + i);
        }
    }
}
