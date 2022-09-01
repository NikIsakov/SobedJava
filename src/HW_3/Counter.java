package HW_3;

import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable {
    CommonResource res;
    ReentrantLock locker;
    int module;

    public Counter(CommonResource res, ReentrantLock locker, int module) {
        this.res = res;
        this.locker = locker;
        this.module = module;
    }

    @Override
    public void run() {
        locker.lock();
        try {
            res.x=1;
            for (int i=1;i<module+1;i++){
                System.out.println(res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            locker.unlock();
        }

    }
}
