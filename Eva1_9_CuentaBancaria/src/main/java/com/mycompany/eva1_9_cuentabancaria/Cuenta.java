/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_9_cuentabancaria;

/**
 *
 * @author irvingvalles
 */
public class Cuenta {
    
    private String titular;
    private double monto;
    
    public Cuenta (String titular, double monto){
    this.monto = monto;
    }
     
    public void retirar(double monto){
        if(this.monto > monto)
        this.monto -= monto;
        else System.out.println("Monto insuficiente");
    
    }
    
    public void depositar(double monto){
        if (monto > 0)
        this.monto += monto;
        else System.out.println("No se puede realizar el deposito");
    }
    
    public void imprimiSaldo(){
        System.out.println("Tu saldo es: " + monto);
    }
    
    
}