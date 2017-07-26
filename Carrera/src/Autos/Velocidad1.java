package Autos;

public class Velocidad1 implements Runnable{

    @Override
    public void run() {
        int velocidad = 30;
        int recorrido = 0;
        while(recorrido < 1000) {
            recorrido+=velocidad;            
            System.out.println("Auto1-Recorrio: " + recorrido);
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                
            }
        }
        
    }
    
}
