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

public class Termometro {
    private Scanner scanner =new Scanner(System.in);
    private double TempCels;
    private double TempFah;
    private double TempKelv;

    public Termometro(double TempCels) {
        this.TempCels = TempCels;
        this.TempFah=TempFah=0;
        this.TempKelv=TempKelv=0;
    }

    public double getTempCels() {
        return TempCels;
    }

    public double getTempFah() {
        return TempFah;
    }

    public double getTempKelv() {
        return TempKelv;
    }

    public void setTempCels(double TempCels) {
        if (TempCels >= -273.15){
             this.TempCels = TempCels;
        }
        else{
            System.err.println("La temperatura no es valida");
        }
    }

    public void setTempFah(double TempFah) {
        if (TempFah >= -459.67){
             this.TempFah = TempFah;
        }
        else{
            System.err.println("La temperatura no es valida");
        }
    }

    public void setTempKelv(double TempKelv) {
        if (TempFah >=0){
            this.TempKelv = TempKelv;
        }
        else{
            System.err.println("La temperatura no es valida");
        }
       
    }
    
   public void establecerTempCels(Termometro termometro){
       System.out.println("Ingresa la nueva temperatura");
       TempCels=scanner.nextDouble();
        termometro.setTempCels(termometro.getTempCels());
        System.out.println("La tempertatura en Celsius es : "+termometro.getTempCels());
       
   }
    public void convertTempFah(Termometro termometro){
        termometro.setTempFah(((9/5)*termometro.getTempCels())+32);
        System.out.println("La tempertatura en Fahrenheit es : "+termometro.getTempFah());
        
    }
    
    public void convertKelv(Termometro termometro){
        termometro.setTempKelv((termometro.getTempCels()+ 273.15));
        System.out.println("La temperatura en Kelvin es: "+termometro.getTempKelv());
    }
    
   
}
