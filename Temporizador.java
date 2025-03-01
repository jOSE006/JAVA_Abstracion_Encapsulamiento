/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientada_objetos_abstracción_encapsulamiento;

/**
 *
 * @author herbe
 */
public class Temporizador {
    private int TiempoActual;
    private Alarma alarma;
    private boolean enMarcha;

    public Temporizador() {
        this.TiempoActual = 0;
         this.enMarcha = true;
    }
    public void iniciar() {
         while (enMarcha) {
            try {
                Thread.sleep(1000); 
                TiempoActual++;
                System.out.println("Tiempo: " + TiempoActual);
                verificarAlarma();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
     public void asociarAlarma(Alarma alarma) {
        this.alarma = alarma;
    }
     private void verificarAlarma() {
        if (TiempoActual == alarma.getTiempoObjetivo()) {
            alarma.activar();
            enMarcha = false;
        }
    }
}

