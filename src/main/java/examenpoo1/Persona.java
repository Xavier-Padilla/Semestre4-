/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo1;

/**
 *
 * @author Joker
 */
public class Persona {
    String nombre;
    int edad;
    
    Persona(String nombre , int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarInformacion(){
        System.out.println("nombre: "+ nombre + "edad: " + edad);
    }
}
