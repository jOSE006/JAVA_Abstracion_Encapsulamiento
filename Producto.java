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

public class Producto {
    private Scanner scanner =new Scanner(System.in);
    private String codigo;
    private String nom;
    private double prec;
    
    public Producto(String codigo, String nom, double prec) {
        this.codigo = codigo;
        this.nom = nom;
        this.prec = prec;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNom() {
        return nom;
    }


    public double getPrec() {
        
        return prec;
    }

    public void setCodigo(String codigo) {
        if(codigo != codigo){
            this.codigo = codigo;
        }
        else
        {
            System.err.println("El codigo debe de ser diferente");
        }
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

 
    public void setPrec(double prec) {
        if (prec>=0.00){
            
        }
        else {
            System.err.println("Precio no puede ser negativo");
        }
    }
    
    public void CambioPrecio(Producto producto){
        System.out.println("Ingrese el nuevo precio por favor");
        prec = scanner.nextDouble();
        if(prec>=0){
              producto.setPrec(producto.getPrec());
        System.out.println("El nuevo precio es: "+producto.getPrec()+" "+"del producto: "+ producto.getNom()+" y codigo: "
                           +producto.getCodigo());
        }
        else{
            System.err.println("Precio no puede ser negativo");
        }
      
    }
    public void CambioNom(Producto producto){
        System.out.println("Ingrese el nuevo nombre: ");
        nom=scanner.nextLine();
        producto.setNom(producto.getNom());
        System.out.println("El nuevo nombre es: "+producto.getNom()+" con el precio de: "+ producto.getPrec()
                            +" y codigo: "+producto.getCodigo());
        
    }
}
