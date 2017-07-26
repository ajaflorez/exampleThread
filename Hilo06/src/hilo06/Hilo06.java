package hilo06;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo06 {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        for(int i = 0; i < 3; i++) {
            executor.submit(new Hilo(latch));
        }
        
        try {
            latch.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo06.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Completed.");
    }
    
}
