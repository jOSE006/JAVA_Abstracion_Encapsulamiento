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

public class Alarma {
    Scanner scanner = new Scanner(System.in);
    private int tiempoObjetivo; 

   
    public Alarma() {
        this.tiempoObjetivo = tiempoObjetivo;
    }

    public void setTiempoObjetivo(int tiempoObjetivo) {
        this.tiempoObjetivo = tiempoObjetivo;
    }

   
    public int getTiempoObjetivo() {
        return tiempoObjetivo;
    }

   public void EstablecerAlarma(Alarma alarma){
       System.out.println("Ingresa el tiempo para activar la alarma: ");
       tiempoObjetivo=scanner.nextInt();
       alarma.setTiempoObjetivo(alarma.getTiempoObjetivo());
       
   }
    public void activar() {
        System.out.println("Alarma activada: " + tiempoObjetivo);
    }
}
