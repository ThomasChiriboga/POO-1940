/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Thomas
 */
public class Animal {
    String Especie;
    String Nombre;
    
    public Animal (String Nombre, String Especie){
        this.Especie=Especie;
        this.Nombre=Nombre;
    }

public void informacion (){
System.out.println("El nombre es " + Nombre + " y la especie es " + Especie);
}    

}
