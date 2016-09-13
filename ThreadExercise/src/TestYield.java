/**
 * Test the join method of Thread
 * Created by fish-Xiang on 2016/9/13.
 */
public class TestYield {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("aa");
        MyThread3 t2 = new MyThread3("bb");
        t1.start();
        t2.start();
    }
}

class MyThread3 extends Thread {
    MyThread3(String s) {
        super(s);
    }
    public void run() {
        for (int i=1; i<=100; i++) {
            System.out.println(getName() + ": " + i);
            if ( i % 10 == 0)
                yield();
        }
    }
}