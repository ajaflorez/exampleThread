/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autos;

/**
 *
 * @author sistemas-16
 */
public class Velocidad2 implements Runnable {

    @Override
    public void run() {
        int velocidad = 50;
        int recorrido = 0;
        while(recorrido < 1000) {
            recorrido+=velocidad;
            System.out.println("Auto2-Recorrio: " + recorrido);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                
            }
        }
    }
    
}
