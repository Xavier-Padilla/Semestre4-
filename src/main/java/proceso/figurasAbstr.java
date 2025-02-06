/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proceso;

import udelp.edu.poo.udelp.edu.poo.newpackage.circulo;
import udelp.edu.poo.udelp.edu.poo.newpackage.figura;
import udelp.edu.poo.udelp.edu.poo.newpackage.rombo;

/**
 *
 * @author Joker
 */




public class figurasAbstr extends figurasProceso<figura> {

    @Override
    protected Double perimetro(figura figura) {
        if (figura instanceof rombo) {
            return figura.getLado() * 4;
        } else if (figura instanceof circulo) {
            circulo c = (circulo) figura;
            return 2 * Math.PI * c.getRadio();
        }
        return 0.0;
    }

    @Override
    protected Double area(figura figura) {
        if (figura instanceof rombo) {
            rombo r = (rombo) figura;
            return (r.getDiagonalMayor() * r.getDiagonalMenor()) / 2;
        } else if (figura instanceof circulo) {
            circulo c = (circulo) figura;
            return Math.PI * Math.pow(c.getRadio(), 2);
        }
        return 0.0;
    }
}