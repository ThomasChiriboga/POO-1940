/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber_encapsulamiento;

/**
 *
 * @author tommy
 */
public class Persona {
    public String nombre;
    public String apellido;
    private long cedula;
    private final long id;
    private static long contadorID = 1;
    
    public Persona (String nombre, String apellido, long cedula){
    this.nombre=nombre;
    this.apellido=apellido;
    setCedula(cedula);
    this.id=contadorID++;
    }
    
    public long getCedula (){
    return cedula;
    }
    
    public void setCedula(long cedula) {
        if (String.valueOf(cedula).length() == 10) {
            this.cedula = cedula;
        } else {
            throw new IllegalArgumentException("Cedula invalida. Debe tener 10 digitos.");
        }
    }
    
    public long getId (){
    return id;
    }
}