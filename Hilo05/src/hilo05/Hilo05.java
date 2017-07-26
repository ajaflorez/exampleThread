package hilo05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Ejemplo: http://jarroba.com/multitarea-e-hilos-en-java-con-ejemplos-ii-runnable-executors/
public class Hilo05 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        for(int i = 0; i < 5; i++) {
            executor.submit(new Hilo(i));
        }
        executor.shutdown();
        
        System.out.println("All task submitted.");
        
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo05.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("All task submitted.");
    }
    
}
