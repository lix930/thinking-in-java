/**
 * Created by fish-Xiang on 2016/9/13.
 */
import java.util.*;

class MyThread extends Thread {
    boolean flag = true;

    public void run() {
        while(flag) {
            System.out.println("===" + new Date() + "===");
            try {
                sleep(1000); // 1000ms = 1s
            } catch (InterruptedException e){
                System.out.println("interrupted exception");
                return;

            }
        }
    }
}
public class TestInterrupt {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.sleep(10000);
            thread.flag = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
            thread.interrupt();
        }
    }
}

