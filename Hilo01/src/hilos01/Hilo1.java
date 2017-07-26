package hilos01;

import java.util.logging.Level;
import java.util.logging.Logger;

// Implementación de hilos con herencia de la clase Thread
// y creando un objeto de la clase hija
public class Hilo1 extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hilo1: "  + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
