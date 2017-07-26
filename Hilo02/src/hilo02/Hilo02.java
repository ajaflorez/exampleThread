/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo02;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Hilo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hilo1 hilo1 = new Hilo1();
        hilo1.start();
        
        System.out.println("Press Intro for STOP");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        
        hilo1.shutdown();
    }
    
    
    
}
