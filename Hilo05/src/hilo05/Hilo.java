package hilo05;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo implements Runnable{
    private int id = 0;

    public Hilo(int id) {
        this.id = id;
    }    
    
    @Override
    public void run() {
        System.out.println("Starting: " + this.id);
        try {            
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Completed: " + this.id);
    }
    
}
