/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proceso;

import udelp.edu.poo.udelp.edu.poo.newpackage.cuadrado;

/**
 *
 * @author Joker
 */
public class cuadradoProceso extends figurasProceso <cuadrado>{

    @Override
  public Double perimetro(cuadrado cuadrado) {
    return cuadrado.getLado() * 4;
}
 @Override
public Double area(cuadrado cuadrado) {
    return cuadrado.getLado() * cuadrado.getLado();
}
    /**
    public Double perimtero(cuadrado cuadrado){
        return cuadrado.getLado()*4;
    }
    public Double area(cuadrado cuadrado){
        return cuadrado.getLado()* cuadrado.getLado();
    }
     */
}
