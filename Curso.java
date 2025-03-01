/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientada_objetos_abstracción_encapsulamiento;

/**
 *
 * @author herbe
 */

import java.util.ArrayList;
import java.util.List;
public class Curso {
    
    private List<Estudiante> estudiantes; 

    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    
    public double calcularPromedio() {
        if (estudiantes.isEmpty()) {
            return 0;
        }
        int sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNotaFinal();
        }
        return (double) sumaNotas / estudiantes.size();
    }


    public List<Estudiante> obtenerEstudiantesAprobados() {
        List<Estudiante> aprobados = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNotaFinal() >= 61) {
                aprobados.add(estudiante);
            }
        }
        return aprobados;
    }
    
    public void MostrarEstudiantesAprobados(Curso curso){
        List<Estudiante> aprobados = curso.obtenerEstudiantesAprobados();
        System.out.println("Estudiantes aprobados:");
        for (Estudiante estudiante : aprobados) {
            System.out.println(estudiante.getNombre() + " - Carnet: " + estudiante.getCarnet() + " - Nota: " + estudiante.getNotaFinal());
        }
    }
    
}
