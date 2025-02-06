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
public class trianguloProceso extends figurasProceso <triangulo> {
   
    @Override
  public Double perimetro(triangulo triangulo) {
     return triangulo.getLado() * 3;
}
 @Override
public Double area(triangulo triangulo) {
   return (triangulo.getBase() * triangulo.getAltura()) / 2;
}
}
