package hilos01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo01 {

    public static void main(String[] args) {
        // Ejemplo de Hilo1
        /*Hilo hilo1 = new Hilo();
        Hilo hilo2 = new Hilo();
        hilo1.start();
        hilo2.start();*/
        
        // Ejemplo de Hilo2
        Thread hilo2 = new Thread(new Hilo2());
        Thread hilo3 = new Thread(new Hilo2());        
        hilo2.start();
        hilo3.start();
        
        // Ejemplo de Hilo3
        Thread hilo4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                System.out.println("Hilo3: "  + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
        });
        
       hilo4.start();
        
        
    }
    
}
