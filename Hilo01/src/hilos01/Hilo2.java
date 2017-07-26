
package hilos01;

import java.util.logging.Level;
import java.util.logging.Logger;

// Implementación de hilos con Implements de la interface Runnable
// y creando un objeto de la clase Thread
public class Hilo2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hilo2: "  + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
