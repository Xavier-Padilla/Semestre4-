/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo1;

/**
 *
 * @author Joker
 */


class Vehiculo {
    String marca;
    String modelo;
    int year;

    Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public void mostrarDetalles() {
        System.out.println("marca: " + marca + ", modelo: " + modelo + ",año: " + year);
    }
}



