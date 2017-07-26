/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos01;

/**
 *
 * @author Jaz
 */
public class Hilos01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hilito h1 = new Hilito("Juan");
        Hilito h2 = new Hilito("Jose");
        Hilito h3 = new Hilito("Carlos");
        Hilito h4 = new Hilito("Ricardo");
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        System.out.println("TErmino el main");
    }
}
