package Hilo;

// Crear una clase que use la implmentacion de Runnable


public class SubProcesoOne implements Runnable {
    @Override
    // run es el procedimiento que se ejecuta en el Thread(Hilo)
    public void run() {
        for(int i=0; i < 100;i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
}
