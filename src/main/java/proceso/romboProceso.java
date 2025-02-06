/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proceso;

import udelp.edu.poo.udelp.edu.poo.newpackage.rombo;

/**
 *
 * @author Joker
 */
public class romboProceso {
      public Double perimetro(rombo rombo) {
        return rombo.getLado() * 4;
    }

    public Double area(rombo rombo) {
        return (rombo.getDiagonalMayor() * rombo.getDiagonalMenor()) / 2;
    }
}
