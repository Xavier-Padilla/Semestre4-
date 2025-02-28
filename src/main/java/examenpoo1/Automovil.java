/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo1;

/**
 *
 * @author Joker
 */
public class Automovil extends Vehiculo {
 int numeroPuertas;

    Automovil(String marca, String modelo, int year, int numeroPuertas) {
        super(marca, modelo, year);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
   public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("número de puertas: " + numeroPuertas);
    }
}


