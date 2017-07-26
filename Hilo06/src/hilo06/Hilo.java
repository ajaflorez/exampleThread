package hilo06;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo implements Runnable{
    private CountDownLatch latch;
    public Hilo(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public void run() {
        System.out.println("Started");
        try {            
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
           ex.printStackTrace();
        }
        latch.countDown();
    }
    
}
