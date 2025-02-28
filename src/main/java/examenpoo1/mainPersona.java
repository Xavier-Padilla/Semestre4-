/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpoo1;

import java.util.Scanner;



/**
 *
 * @author Joker
 */

public class mainPersona {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del profesor: ");
        String nombreProfesor = scanner.nextLine();
        System.out.println("Ingrese edad del profesor: ");
        int edadProfesor = scanner.nextInt();
        System.out.println("Ingrese salario del profesor: ");
        double salarioProfesor = scanner.nextDouble();
        scanner.nextLine(); 
        
        Profesor profesor = new Profesor(nombreProfesor, edadProfesor, salarioProfesor);

        System.out.println("Ingrese nombre del curso: ");
        String nombreCurso = scanner.nextLine();

        System.out.println("Ingrese capacidad máxima de estudiantes: ");
        int capacidadEstudiantes = scanner.nextInt();
        scanner.nextLine();
        
        Curso curso = new Curso(nombreCurso, profesor, capacidadEstudiantes);

        
        System.out.println("Ingrese nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.println("Ingrese edad del estudiante: ");
        int edadEstudiante = scanner.nextInt();
        System.out.println("Ingrese promedio del estudiante: ");
        double promedioEstudiante = scanner.nextDouble();
        scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante, promedioEstudiante);
        curso.agregarEstudiante(estudiante);
        curso.mostrarDetallesCurso();
        scanner.close();
    }
}
