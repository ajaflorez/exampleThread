package Hilo;


public class SubProcesoTwo implements Runnable{

    @Override
    public void run() {
        for(char cha = 'a'; cha <= 'z'; cha++) {
            System.out.println(cha);
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
}
