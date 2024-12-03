/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deber_encapsulamiento;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Deber_encapsulamiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();

        Persona p1 = new Persona("Alex", "Macias", 1234567890L);
        Persona p2 = new Persona("Luis", "Rodriguez", 9876540321L);

        System.out.println("Lista de personas:");
        System.out.println("ID: " + p1.getId() + ", Nombre: " + p1.nombre + ", Apellido: " + p1.apellido + ", Cedula: " + p1.getCedula());
        System.out.println("ID: " + p2.getId() + ", Nombre: " + p2.nombre + ", Apellido: " + p2.apellido + ", Cedula: " + p2.getCedula());

        System.out.println("\nIngrese el ID de la persona a modificar:");
        int idModificar = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Ingrese la nueva cedula:");
        String nuevaCedulaStr = scanner.nextLine(); 

        try {
            long nuevaCedula = Long.parseLong(nuevaCedulaStr); 

            if (idModificar == p1.getId()) {
                admin.cambiarCedula(p1, nuevaCedula);
            } else if (idModificar == p2.getId()) {
                admin.cambiarCedula(p2, nuevaCedula);
            } else {
                System.out.println("ID no encontrado.");
            }
            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("personas.txt"))) {
                writer.write("ID: " + p1.getId() + ", Nombre: " + p1.nombre + ", Apellido: " + p1.apellido + ", Cédula: " + p1.getCedula());
                writer.newLine();
                writer.write("ID: " + p2.getId() + ", Nombre: " + p2.nombre + ", Apellido: " + p2.apellido + ", Cédula: " + p2.getCedula());
                System.out.println("Datos guardados en 'personas.txt'.");
            } catch (IOException e) {
                System.out.println("Error al guardar los datos: " + e.getMessage());
            }

        } catch (NumberFormatException e) {
            System.out.println("La cedula debe ser un numero valido.");
        }

        scanner.close();
    }

}
    

