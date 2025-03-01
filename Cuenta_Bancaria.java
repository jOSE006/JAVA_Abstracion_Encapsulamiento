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

public class Cuenta_Bancaria {
    
    Scanner scanner = new Scanner(System.in);
    private String Nomtit;
    private int NumCuenta;
    private int SalIni=125;
    private int SaldoDp;
    private int SaldoRt;
    private int SaldTtl;
    private Cuenta_Bancaria ListCuent[]=new Cuenta_Bancaria[100000];
    private int CantCuentBanc=0;

    public Cuenta_Bancaria(String Nomtit,int NumCuenta) {
        this.Nomtit=Nomtit;
        this.NumCuenta = NumCuenta;
        this.SaldoDp = SaldoDp=0;
        this.SaldoRt=SaldoRt=0;
        this.SaldTtl = SaldTtl=0;
    }

    public String getNomtit() {
        return Nomtit;
    }

    
    public int getSaldoDp() {
        return SaldoDp;
    }

    public int getSaldoRt() {
        return SaldoRt;
    }
    

    public int getSaldTtl() {
        return SaldTtl;
    }
    
    public int getNumCuenta() {
        return NumCuenta;
    }

    public int getSalIni() {
        return SalIni;
    }

    public void setNomtit(String Nomtit) {
        this.Nomtit = Nomtit;
    }

    
    public void setSaldoDp(int SaldoDp) {
        this.SaldoDp = SaldoDp;
    }

    public void setSaldoRt(int SaldoRt) {
        if(SaldTtl>=0){
            this.SaldoRt = SaldoRt;
        }
        else {
            System.err.println("Ingresa un valor menor o igual al saldo que tienes en tu cuenta.");
        }
    }

    public void setSaldTtl(int SaldTtl) {
        if(SaldTtl>=0){
            this.SaldTtl = SaldTtl;
        }
        else {
        System.err.println("El saldo total no puede ser menor a 0");
    }
    }
  
    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public void setSalIni(int SalIni) {
        this.SalIni = SalIni;
    }
    
    public void AperturarCuenta(Cuenta_Bancaria cuenta){
        this.ListCuent[CantCuentBanc]=cuenta;
        CantCuentBanc++;
        SaldTtl=SalIni+SaldTtl;
    }
   public void MosstrarDatosCuenta(Cuenta_Bancaria cuenta) {
        System.out.println("Nombre del Titular: " + cuenta.getNomtit());
        System.out.println("Numero de Cuenta: " + cuenta.getNumCuenta());
        System.out.println("Saldo Total: " + cuenta.getSaldTtl());
   }
  
   public void RetirarFondos(Cuenta_Bancaria cuenta){
    System.out.println("Ingrese el saldo a retirar: ");
    SaldoRt=scanner.nextInt();
    cuenta.setSaldTtl(cuenta.getSaldTtl() - SaldoRt);
    cuenta.MosstrarDatosCuenta(cuenta);
   }
   
   public void DepositarFondos(Cuenta_Bancaria cuenta){
     System.out.println("Ingrese saldo a Depositar: ");
     SaldoDp=scanner.nextInt();
     cuenta.setSaldTtl(cuenta.getSaldTtl()+SaldoDp);
      cuenta.MosstrarDatosCuenta(cuenta);
   }
}
