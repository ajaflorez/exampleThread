package hilos;

import Hilo.SubProcesoOne;
import Hilo.SubProcesoTwo;
import java.sql.Time;

public class TestHilos {

    public static void main(String[] args) throws InterruptedException {
        // Primero crear un objeto de la clase que contiene run
        SubProcesoOne subpro = new SubProcesoOne();        
        SubProcesoTwo subpro2 = new SubProcesoTwo();        
        // Crear el Hilo, instanciado con el objeto de la clase que
        // contiene run
        Thread hilo = new Thread(subpro);   // declaracion e instanciacion
        hilo.start();   // Lanza el hilo y tiene una demora 
        
        Thread hilo2 = new Thread(subpro2); 
        hilo2.start();
        
        
        
        for(int i=1000; i < 1100;i++) {
            System.out.println(i);
            Thread.sleep(50);
            
        }
        
        Thread hilo3 = new Thread(subpro2); 
        hilo3.start();
        
        
    }
    
}
