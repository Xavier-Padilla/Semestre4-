/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proceso;

/**
 *
 * @author Joker
 * 
 */
public abstract class figurasProceso <T>{
    
    public void calcula( T figura){
        System.out.println("El perimetro es : " + perimetro(figura));
        System.out.println("El area es : " + area(figura));
    }
    
    protected abstract Double perimetro (T figura);
    protected abstract Double area (T figura);
    
}
