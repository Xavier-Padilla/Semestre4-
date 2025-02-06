/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proceso;

import udelp.edu.poo.udelp.edu.poo.newpackage.cuadrado;

/**
 *
 * @author Xavier Padilla
 */
public class figurasImpl implements iFiguraProceso <cuadrado>{   
    @Override
    public Double perimetro(cuadrado figura) {
        if (figura == null || figura.getLado() == null) {
            throw new IllegalArgumentException("El cuadrado o su lado no pueden ser nulos.");
        }
        return figura.getLado() * 4;
    }

    @Override
    public Double area(cuadrado figura) {
        if (figura == null || figura.getLado() == null) {
            throw new IllegalArgumentException("El cuadrado o su lado no pueden ser nulos.");
        }
        return figura.getLado() * figura.getLado();
    }
}
