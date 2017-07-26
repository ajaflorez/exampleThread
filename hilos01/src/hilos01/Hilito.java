/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos01;

/**
 *
 * @author Jaz
 */
public class Hilito extends Thread{
    /** nombre del hilo */
    private String nombre;
    public Hilito(String nombre)
    {
        this.nombre = nombre;
    }
    @Override
    public void run()
    {
        for(int i = 0; i<20; i++)
            System.out.println(i + " " + this.nombre);
        System.out.println("termino hilo " + this.nombre);
    }
    
}
