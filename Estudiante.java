/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientada_objetos_abstracción_encapsulamiento;

/**
 *
 * @author herbe
 */
import java.util.Scanner;
public class Estudiante {
    
    Scanner scanner = new Scanner(System.in);
    private String nombre; 
    private String carnet; 
    private int notaFinal; 

    
    public Estudiante() {
        this.nombre = nombre;
        this.carnet = carnet;
        this.notaFinal=notaFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    
    public void setNotaFinal(int notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 100) {
            this.notaFinal = notaFinal;
        } else {
            System.err.println("La nota debe estar entre 0 y 100.");
        }
    }
    
    public void AsignarDatos(Estudiante estudiante){
        System.out.println("Ingresa el nombre por favor");
        nombre=scanner.nextLine();
        estudiante.setNombre(estudiante.getNombre());
        System.out.println("Ingresa el carnet por favor");
        carnet=scanner.nextLine();
        estudiante.setCarnet(estudiante.getCarnet());
        System.out.println("Ingresa la nota final por favor");
        notaFinal=scanner.nextInt();
        estudiante.setNotaFinal(estudiante.getNotaFinal());
        
        
    }
}
