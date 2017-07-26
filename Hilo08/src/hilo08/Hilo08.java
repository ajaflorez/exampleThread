package hilo08;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo08 {

    public static void main(String[] args) {
        
        final Hilo hilo = new Hilo();
        final HiloLow hiloLow = new HiloLow();
        
        
        Thread h1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //hilo.produce();
                    hiloLow.produce();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo08.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread h2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //hilo.consume();
                    hiloLow.consume();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo08.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        h1.start();
        h2.start();
        
        
        try {
            h1.join();
            h2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo08.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
