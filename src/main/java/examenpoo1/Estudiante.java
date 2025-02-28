/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo1;

/**
 *
 * @author Joker
 */
public class Estudiante extends Persona {
      Double promedio;
    public Estudiante(String nombre, int edad, Double promedio) {
        super(nombre, edad);
        this.promedio=promedio;
    }
    
    @Override
   public void mostrarInformacion(){
      super.mostrarInformacion();
      System.out.println("el promedio es: " + promedio);
    }
}
