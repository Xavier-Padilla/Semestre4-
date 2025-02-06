/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proceso;

import udelp.edu.poo.udelp.edu.poo.newpackage.triangulo;



/**
 *
 * @author Joker
 */
public class triangulolmpl implements iFiguraProceso <triangulo>{
    @Override
    public Double perimetro(triangulo figura) {
        if (figura == null || figura.getLado() == null) {
            throw new IllegalArgumentException("El triangulo o su lado no pueden ser nulos.");
        }
          return figura.getLado() * 3;
    }

    @Override
    public Double area(triangulo figura) {
        if (figura == null || figura.getLado() == null) {
            throw new IllegalArgumentException("El triangulo o su lado no pueden ser nulos.");
        }
         return (figura.getBase() * figura.getAltura()) / 2;
    }
}
