/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo1;

/**
 *
 * @author Joker
 */
public class Profesor extends Persona {
    Double salario;
    public Profesor(String nombre, int edad, Double salario) {
        super(nombre, edad);
        this.salario=salario;
    }
    
    @Override
   public void mostrarInformacion(){
      super.mostrarInformacion();
      System.out.println("salario profesor: " + salario);
    }
    
}
