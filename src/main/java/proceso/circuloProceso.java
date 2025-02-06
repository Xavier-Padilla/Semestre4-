/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proceso;

import udelp.edu.poo.udelp.edu.poo.newpackage.circulo;

/**
 *
 * @author Joker
 */
public class circuloProceso {
    public Double perimetro(circulo circulo) {
        return 2 * Math.PI * circulo.getRadio();
    }

    public Double area(circulo circulo) {
        return Math.PI * Math.pow(circulo.getRadio(), 2);
    }
}
