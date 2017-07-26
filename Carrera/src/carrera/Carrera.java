package carrera;

import Autos.Velocidad1;
import Autos.Velocidad2;
import java.nio.file.Files;

public class Carrera {

    public static void main(String[] args) {
        Velocidad1 velo1 = new Velocidad1();
        Velocidad2 velo2 = new Velocidad2();
        
        Thread auto1 = new Thread(velo1);
        Thread auto2 = new Thread(velo2);
        
        auto1.start();
        auto2.start();
        
        
        
    }
    
}
