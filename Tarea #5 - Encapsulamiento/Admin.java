/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber_encapsulamiento;

/**
 *
 * @author tommy
 */
public class Admin {
   public void cambiarCedula(Persona persona, long nuevaCedula) {
        try {
            persona.setCedula(nuevaCedula);
            System.out.println("Cedula actualizada con exito.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    } 
}
