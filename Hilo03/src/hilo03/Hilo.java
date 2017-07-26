/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo03;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo {
    private int count = 0;
    
    private synchronized void increment() {
        count++; 
    }
    
    public void doWork() {
        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++)
                    increment();
            }
        });
        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++)
                    increment();
            }
        });
        
        hilo1.start();
        hilo2.start();
        
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        System.out.println("Count: " + count);
    }
}
