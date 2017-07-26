package hilo02;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo1 extends Thread{
    private volatile boolean running = true;

    @Override
    public void run() {
        while(running) {
            System.out.println("Hilo1: ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
    public void shutdown() {
        running = false;
    }
        
}
