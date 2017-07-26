package hilo07;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo07 {

    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    
    public static void main(String[] args) {
        Thread h1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo07.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread h2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo07.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        h1.start();
        h2.start();
        
        
        try {
            h1.join();
            h2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo07.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static void producer() throws InterruptedException {
        Random random = new Random();
        while(true) {
            queue.put(random.nextInt(100));
        }
    }
    private static void consumer() throws InterruptedException {
        Random random = new Random();
        while(true) {
            Thread.sleep(100);
            if(random.nextInt(10) == 0) {
                Integer value = queue.take();
                System.out.println("Take value : " + value + "; Queue size is: " + queue.size());
            }
        }
    }
    
}
