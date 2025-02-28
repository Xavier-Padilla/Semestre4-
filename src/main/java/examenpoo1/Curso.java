/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package examenpoo1;

/**
 *
 * @author Joker
 */
class Curso {
    private String nombreCurso;
    private Profesor profesor;
    private ArrayStack listaEstudiantes;

    public Curso(String nombreCurso, Profesor profesor, int estudiantes) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.listaEstudiantes = new ArrayStack(estudiantes);
    }
     public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.push(estudiante);
    }
     
     public void mostrarDetallesCurso(){
        System.out.println("Curso: "+ nombreCurso);
        System.out.println("Profesor: ");
        profesor.mostrarInformacion();
        System.out.println("Estudiantes: ");
        while (!listaEstudiantes.isEmpty()) {
            Estudiante estudiante = (Estudiante) listaEstudiantes.pop();
            estudiante.mostrarInformacion();
     }
}
}