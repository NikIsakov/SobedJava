package HW_3;

public class PingPong extends Thread{
    private String pingPong;
    private static final Object monitor = new Object();

        public PingPong(String p) {
        this.pingPong=p;
    }

    @Override
    public void run() {
            while (true){
                synchronized (monitor){
                    System.out.println(this.pingPong);
                    monitor.notifyAll();

                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
    }


}
