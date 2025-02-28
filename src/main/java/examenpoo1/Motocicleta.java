/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo1;

/**
 *
 * @author Joker
 */
public class Motocicleta extends Vehiculo{
    String tipoMoto;
    public Motocicleta(String marca, String modelo, int year, String tipoMoto) {
        super(marca, modelo, year);
        this.tipoMoto=tipoMoto;
    }
    @Override
   public void mostrarDetalles(){
      super.mostrarDetalles();
      System.out.println("tipo de moto: " + tipoMoto);
    }
}
