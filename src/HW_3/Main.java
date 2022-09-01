package HW_3;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

//        PingPong ping = new PingPong("PING");
//        PingPong pong = new PingPong("PONG");
//
//        ping.start();
//        pong.start();

        CommonResource commonResource= new CommonResource();
        ReentrantLock locker = new ReentrantLock();

        Thread t = new Thread(new Counter(commonResource,locker,100));
        t.start();


    }

}
