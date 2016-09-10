/**
 * Created by fish-Xiang on 2016/9/10.
 */
interface pet{
    public void feeding();
    public void play();
}

class Worker implements pet {

    @Override
    public void feeding() {
        System.out.println("Worker is feeding");
    }

    @Override
    public void play() {
        System.out.println("worker is playing");
    }
}


public class Exercise {
}
