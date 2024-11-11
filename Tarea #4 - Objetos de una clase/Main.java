/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Thomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal Perro = new Animal ("Perro" ,"Mamifero" );
        Perro.informacion();
        
        Animal Ballena = new Animal ("Ballena" ,"Cetaceo" );
        Ballena.informacion();
        
        Animal Condor = new Animal ("Condor" ,"Ave" );
        Condor.informacion();
    }
    
}
